package playground;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SoilDataLoader {
    public static SoilData loadSoilData(String filename) throws IOException {
            SoilData soil = new SoilData();

            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = br.readLine()) != null) {
                    // Skip header
                    if (line.startsWith("Feature")) continue;

                    String[] parts = line.split(",");
                    if (parts.length < 3) continue;

                    String feature = parts[0].trim();
                    double value = Double.parseDouble(parts[2].trim());

                    switch (feature) {
                        case "phh2o_5-15cm_mean":
                            soil.setpH(value);
                            break;
                        case "nitrogen_5-15cm_mean":
                            soil.setNitrogen(value);
                            break;
                        case "clay_5-15cm_mean":
                            soil.setClay(value);
                            break;
                        case "sand_5-15cm_mean":
                            soil.setSand(value);
                            break;
                        case "silt_5-15cm_mean":
                            soil.setSilt(value);
                            break;
                        case "soc_5-15cm_mean":
                            soil.setOrganicCarbon(value);
                            break;
                        // Add others as needed
                    }
                }
            }
            return soil;
    }
}
