package playground;

import java.io.IOException;
import java.util.ArrayList;

public class Playground {
    public static void main(String[] args) throws IOException {

        String soilFile = "dataSets/otawwa_ks_soil.csv";
        String weatherFile = "dataSets/ottawa_ks_weather.csv";

        SoilData soil = SoilDataLoader.loadSoilData(soilFile);
        ArrayList<WeatherDay> weatherList = (ArrayList<WeatherDay>) WeatherDataLoader.loadWeatherData(weatherFile);

        // May 18 to October 2 in span of 9 years
        for(int i = 0; i < weatherList.size(); i++) {
            System.out.print(weatherList.get(i));
        }
    }
}
