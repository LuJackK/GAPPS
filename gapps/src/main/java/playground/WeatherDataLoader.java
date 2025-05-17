package playground;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WeatherDataLoader {

    public static List<WeatherDay> loadWeatherData(String filename) throws IOException {
        List<WeatherDay> weatherList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            // Skip header
            line = br.readLine();

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 15) continue;

                // Parse the fields you want
                int dayOfYear = Integer.parseInt(parts[3].trim());
                double temperature = Double.parseDouble(parts[6].trim());
                double maxTemp = Double.parseDouble(parts[7].trim());
                double minTemp = Double.parseDouble(parts[8].trim());
                double rainfall = Double.parseDouble(parts[9].trim());
                double windSpeed = Double.parseDouble(parts[10].trim());
                double humidity = Double.parseDouble(parts[11].trim());
                double solarRadiation = Double.parseDouble(parts[14].trim());

                WeatherDay wd = new WeatherDay(dayOfYear, temperature, maxTemp, minTemp, rainfall, humidity, windSpeed, solarRadiation);
                weatherList.add(wd);
            }
        }

        return weatherList;
    }
}
