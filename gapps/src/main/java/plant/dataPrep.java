package plant;

import ai.djl.ndarray.NDArray;
import ai.djl.ndarray.NDManager;
import ai.djl.training.dataset.ArrayDataset;
import playground.SampleData;

import java.util.List;

public class dataPrep {
    public ArrayDataset prepareData(NDManager manager, List<SampleData> data){
        int size = data.size();
        int featureSize = data.get(0).features.length;

        float[][] featureArray = new float[size][featureSize];
        float[][] labelArray = new float[size][1];

        for (int i = 0; i < size; i++) {
            SampleData sample = data.get(i);
            for (int j = 0; j < featureSize; j++) {
                featureArray[i][j] = (float) sample.features[j];
            }
            labelArray[i][0] = (float) sample.yield;
        }

        NDArray features = manager.create(featureArray);
        NDArray labels = manager.create(labelArray);
        return new ArrayDataset.Builder().setData(features).optLabels(labels).setSampling(16, true).build();
    }

}
