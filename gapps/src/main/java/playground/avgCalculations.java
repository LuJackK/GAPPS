package playground;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class avgCalculations {

    public static List<WeatherDay> calculateAvg(List<WeatherDay> weatherList) throws IOException {

        List<WeatherDay> futureWeatherList = new ArrayList<>();

        int c = 0;
        double yearOneAvgTemp = 0;
        double yearOneAvgMaxTemp = 0;
        double yearOneAvgMinTemp = 0;
        double yearOneAvgRainfall = 0;
        double yearOneAvgWindSpeed = 0;
        double yearOneAvgHumidity = 0;
        double yearOneAvgSolarRadiation = 0;

        for (WeatherDay wd : weatherList) {
            if(wd.getYear() == 2004){
                yearOneAvgTemp = yearOneAvgTemp + wd.getTemperature();
                yearOneAvgMaxTemp = yearOneAvgMaxTemp + wd.getMaxTemp();
                yearOneAvgMinTemp = yearOneAvgMinTemp + wd.getMinTemp();
                yearOneAvgRainfall = yearOneAvgRainfall + wd.getRainfall();
                yearOneAvgWindSpeed = yearOneAvgWindSpeed + wd.getWindSpeed();
                yearOneAvgHumidity = yearOneAvgWindSpeed + wd.getHumidity();
                yearOneAvgSolarRadiation = yearOneAvgWindSpeed + wd.getSolarRadiation();
                c++;
            }
        }

        yearOneAvgTemp = yearOneAvgTemp/c;
        yearOneAvgMaxTemp = yearOneAvgMaxTemp/c;
        yearOneAvgMinTemp = yearOneAvgMinTemp/c;
        yearOneAvgRainfall = yearOneAvgRainfall/c;
        yearOneAvgWindSpeed = yearOneAvgWindSpeed/c;
        yearOneAvgHumidity = yearOneAvgHumidity/c;
        yearOneAvgSolarRadiation = yearOneAvgSolarRadiation/c;


        c = 0;
        double yearLastAvgTemp = 0;
        double yearLastAvgMaxTemp = 0;
        double yearLastAvgMinTemp = 0;
        double yearLastAvgRainfall = 0;
        double yearLastAvgWindSpeed = 0;
        double yearLastAvgHumidity = 0;
        double yearLastAvgSolarRadiation = 0;

        for (WeatherDay wd : weatherList) {
            if(wd.getYear() == 2019){
                yearLastAvgTemp = yearLastAvgTemp + wd.getTemperature();
                yearLastAvgMaxTemp = yearLastAvgMaxTemp + wd.getMaxTemp();
                yearLastAvgMinTemp = yearLastAvgMinTemp + wd.getMinTemp();
                yearLastAvgRainfall = yearLastAvgRainfall + wd.getRainfall();
                yearLastAvgWindSpeed = yearLastAvgWindSpeed + wd.getWindSpeed();
                yearLastAvgHumidity = yearLastAvgHumidity + wd.getHumidity();
                yearLastAvgSolarRadiation = yearLastAvgSolarRadiation + wd.getSolarRadiation();
                c++;
            }
        }

        yearLastAvgTemp = yearLastAvgTemp/c;
        yearLastAvgMaxTemp = yearLastAvgMaxTemp/c;
        yearLastAvgMinTemp = yearLastAvgMinTemp/c;
        yearLastAvgRainfall = yearLastAvgRainfall/c;
        yearLastAvgWindSpeed = yearLastAvgWindSpeed/c;
        yearLastAvgHumidity = yearLastAvgHumidity/c;
        yearLastAvgSolarRadiation = yearLastAvgSolarRadiation/c;


        double tempInc = (yearLastAvgTemp - yearOneAvgTemp )/15;
        double maxTempInc = (yearLastAvgMaxTemp - yearOneAvgMaxTemp )/15;
        double minTempInc = (yearLastAvgMinTemp - yearOneAvgMinTemp )/15;
        double rainfallInc = (yearLastAvgRainfall - yearOneAvgRainfall )/15;
        double windSpeedInc = (yearLastAvgWindSpeed - yearOneAvgWindSpeed )/15;
        double humidityInc = (yearLastAvgHumidity - yearOneAvgHumidity )/15;
        double solarRadiationInc = (yearLastAvgSolarRadiation - yearOneAvgSolarRadiation )/15;

        double year = 2019;
        for(int i = 0; i < 100; i++){
            yearLastAvgTemp = yearLastAvgTemp + tempInc;
            yearLastAvgMaxTemp = yearLastAvgMaxTemp + maxTempInc;
            yearLastAvgMinTemp = yearLastAvgMinTemp + minTempInc;
            yearLastAvgRainfall = yearLastAvgRainfall + rainfallInc;
            yearLastAvgWindSpeed = yearLastAvgWindSpeed + windSpeedInc;
            yearLastAvgHumidity = yearLastAvgHumidity + humidityInc;
            yearLastAvgSolarRadiation = yearLastAvgSolarRadiation + solarRadiationInc;


            WeatherDay w = new WeatherDay(year, yearLastAvgTemp, yearLastAvgMaxTemp, yearLastAvgMinTemp, yearLastAvgRainfall, yearLastAvgWindSpeed, yearLastAvgHumidity, yearLastAvgSolarRadiation);
            futureWeatherList.add(w);
            year++;
        }

        return futureWeatherList;
    }
}
