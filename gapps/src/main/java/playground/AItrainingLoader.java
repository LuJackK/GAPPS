package playground;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AItrainingLoader {
    public List<SampleData> loadData(String filePath) {
        List<SampleData> dataset = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                double[] features = new double[14];
                for (int i = 0; i < 14; i++) {
                    features[i] = Double.parseDouble(parts[i].trim());
                }

                double yield = Double.parseDouble(parts[14].trim());

                SampleData sample = new SampleData(features, yield);
                dataset.add(sample);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataset;
    }
}
