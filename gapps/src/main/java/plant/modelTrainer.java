package plant;

import ai.djl.Model;
import ai.djl.ndarray.NDArray;
import ai.djl.ndarray.NDList;
import ai.djl.ndarray.NDManager;
import ai.djl.training.DefaultTrainingConfig;
import ai.djl.training.GradientCollector;
import ai.djl.training.Trainer;
import ai.djl.training.dataset.Batch;
import ai.djl.training.dataset.Dataset;
import ai.djl.training.loss.Loss;
import ai.djl.training.optimizer.Optimizer;
import ai.djl.training.tracker.Tracker;
import ai.djl.training.listener.TrainingListener;
public class modelTrainer {

    private final Model model;
    private final Trainer trainer;
    private final NDManager manager;

    public modelTrainer(Model model, NDManager manager) {
        this.model = model;
        this.manager = manager;

        DefaultTrainingConfig config = new DefaultTrainingConfig(Loss.l2Loss())
                .optOptimizer(
                        Optimizer.adam()
                                .optLearningRateTracker(Tracker.fixed(0.001f))
                                .optBeta1(0.9f)
                                .optBeta2(0.999f)
                                .optEpsilon(1e-8f)
                                .build()
                )
                .addTrainingListeners(TrainingListener.Defaults.logging());

        this.trainer = model.newTrainer(config);
        this.trainer.initialize(new ai.djl.ndarray.types.Shape(1, 14)); // 14 input features
    }

    public void train(Dataset dataset, int epochs) throws Exception {
        for (int epoch = 0; epoch < epochs; epoch++) {
            System.out.println("Epoch " + (epoch + 1));

            for (Batch batch : trainer.iterateDataset(dataset)) {
                try (GradientCollector collector = trainer.newGradientCollector()) {

                    NDArray data = batch.getData().head();
                    NDArray labels = batch.getLabels().head();

                    NDArray preds = trainer.forward(new NDList(data)).singletonOrThrow();
                    NDArray lossValue = trainer.getLoss().evaluate(new NDList(labels), new NDList(preds));

                    ((GradientCollector) collector).backward(lossValue);
                }
                // Update model parameters after each batch
                trainer.step();
                batch.close();
            }

            trainer.notifyListeners(listener -> listener.onEpoch(trainer));
        }
    }

    public void close() {
        trainer.close();
        model.close();
        manager.close();
    }
}
