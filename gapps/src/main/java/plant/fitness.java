package plant;

import ai.djl.MalformedModelException;
import ai.djl.Model;
import ai.djl.inference.Predictor;
import ai.djl.ndarray.NDArray;
import ai.djl.ndarray.NDList;
import ai.djl.ndarray.NDManager;
import ai.djl.nn.Block;
import ai.djl.training.ParameterStore;
import ai.djl.translate.TranslateException;
import ai.djl.util.Utils;
import playground.Playground;
import playground.WeatherDay;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fitness {
    private defaultModel defaultModelInstance = new defaultModel(14, 64, 2);
    private Model model;

    public void evaluate(Plant plant, WeatherDay world) throws IOException, MalformedModelException {
        Path modelDir = Paths.get("models");
        model = defaultModelInstance.getModel();
        model.load(modelDir);
        Block block = model.getBlock();
        try (NDManager manager = NDManager.newBaseManager()) {
            double[] plantFeatures = plant.toFeatureArray();
            double[] worldFeatures = world.toFeatureArray();
            double[] features = new double[plantFeatures.length + worldFeatures.length];

            System.arraycopy(plantFeatures, 0, features, 0, plantFeatures.length);
            System.arraycopy(worldFeatures, 0, features, plantFeatures.length, worldFeatures.length);
            float[] featuresF = new float[features.length];
            for(int i=0;i< features.length;i++){
                featuresF[i] = (float) features[i];
            }
            // 14 features
            NDArray input = manager.create(featuresF).reshape(1, featuresF.length);
            NDList inputList = new NDList(input);
            NDList outputList = block.forward(new ParameterStore(manager, false), inputList, false);
            NDArray output = outputList.singletonOrThrow();
            float result = output.getFloat(); // final prediction
            plant.setRanking(result);

        }
    }

}
