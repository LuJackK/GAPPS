package main;

import ai.djl.Model;
import ai.djl.ndarray.NDManager;
import ai.djl.training.dataset.Dataset;
import plant.dataPrep;
import plant.defaultModel;
import plant.modelTrainer;
import playground.AItrainingLoader;
import playground.SampleData;

import java.nio.file.Paths;
import java.util.List;
import plant.defaultModel;
//package Main; izbacuje gresku pa sam komentirala
public class Main {
    public static void main(String[] args) throws Exception {
       /* AItrainingLoader loader = new AItrainingLoader();
        List<SampleData> data = loader.loadData("dataSets/luka.csv");
        dataPrep dp = new dataPrep();
        try (NDManager manager = NDManager.newBaseManager()) {
            Dataset dataset = dp.prepareData(manager, data);

            defaultModel myModel = new defaultModel(14, 64, 2);
            Model model = myModel.getModel();

            modelTrainer trainer = new modelTrainer(model, manager);
            trainer.train(dataset, 10);  // train for 10 epochs

            // Save model to disk (you decide where)
            model.save(Paths.get("models"), "plant-model");

            trainer.close();
        }*/
    }
}
