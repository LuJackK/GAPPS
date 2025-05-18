package main;

import geneticAlgo.GeneticAlgorithm;
import geneticAlgo.makePlant;
import plant.*;
import playground.*;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//package Main; izbacuje gresku pa sam komentirala
public class Main {
    public static void main(String[] args) throws Exception {

        int initialPopulationSize=50;

        Plant[] initialPop=new Plant[initialPopulationSize];


        for (int i = 0; i < initialPopulationSize; i++) {
            initialPop[i]= makePlant.randomPlant();

        }

        System.out.println("Step 1 completed!");

        GeneticAlgorithm g=new GeneticAlgorithm();





        String weatherFile = "dataSets/ottawa_ks_weather.csv";
        ArrayList<WeatherDay> weatherList = (ArrayList<WeatherDay>) WeatherDataLoader.loadWeatherData(weatherFile);
        List<WeatherDay> avg = avgCalculations.calculateAvg(weatherList);


        for (int i = 0; i < avg.size(); i++) {
            System.out.println("-----------------------------------------");
            System.out.println("Year: "+avg.get(i).getYear());
            System.out.println("Temperature: "+avg.get(i).getTemperature());
            System.out.println("MaxTemp: "+avg.get(i).getMaxTemp());
            System.out.println("MinTemp: "+avg.get(i).getMinTemp());
            System.out.println("Rainfall: "+avg.get(i).getRainfall());
            System.out.println("Windspeed: "+avg.get(i).getWindSpeed());
            System.out.println("solar: "+avg.get(i).getSolarRadiation());

        }

                                                                    //THIS 10 NEEEDS TO BE GLOBAL VALUE
        Plant[][] arrayOfBestTroughYears=new Plant[avg.size()][10]; // 100 arrays of 10


        //this way we dont put the best ones into next gen
        for (int i = 0; i < avg.size()  ; i++) {
            arrayOfBestTroughYears[i]=GeneticAlgorithm.testGeneration(initialPop,avg.get(i));

            //initialPop=GeneticAlgorithm.genCrossOver(arrayOfBestTroughYears[i],initialPopulationSize);

            System.out.println("I am here: "+i);
        }

        System.out.println("Step 2 completed!");

        for (int i = 0; i < arrayOfBestTroughYears.length; i++) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Year: "+ i);
            System.out.println("Plant Height: "+ Arrays.stream(arrayOfBestTroughYears[i]).mapToDouble(Plant::getPlant_height).average());
            System.out.println("Number of Pods: "+ Arrays.stream(arrayOfBestTroughYears[i]).mapToDouble(Plant::getNumber_of_pods).average());
            System.out.println("Biological Weights: "+ Arrays.stream(arrayOfBestTroughYears[i]).mapToDouble(Plant::getBiological_weight).average());
            System.out.println("Sugar: "+ Arrays.stream(arrayOfBestTroughYears[i]).mapToDouble(Plant::getSugar).average());
            System.out.println("Relative water: "+ Arrays.stream(arrayOfBestTroughYears[i]).mapToDouble(Plant::getRelative_water).average());
            System.out.println("ChloroA: "+ Arrays.stream(arrayOfBestTroughYears[i]).mapToDouble(Plant::getChlorophyllA).average());
            System.out.println("ChloroB: "+ Arrays.stream(arrayOfBestTroughYears[i]).mapToDouble(Plant::getChlorophyllB).average());
            System.out.println("Protein Percentage: "+ Arrays.stream(arrayOfBestTroughYears[i]).mapToDouble(Plant::getProtein_percentage).average());
            System.out.println("Leaf Area Index: "+ Arrays.stream(arrayOfBestTroughYears[i]).mapToDouble(Plant::getLeaf_area_index).average());
            System.out.println("Seed Yield: "+Arrays.stream(arrayOfBestTroughYears[i]).mapToDouble(Plant::getSeed_yield_per_area).average());

        }



    }
}
