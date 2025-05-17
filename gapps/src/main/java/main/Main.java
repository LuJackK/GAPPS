package main;
import ai.djl.engine.Engine;
import mess.Relations;
import plant.DefaultPlant;
import plant.Plant;
import playground.WeatherDay;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        DefaultPlant basePlant = new DefaultPlant();

        Plant testPlant=new Plant(
                basePlant.getPlant_height()+basePlant.getPlant_height()*0.1,
                basePlant.getNumber_of_pods()+basePlant.getNumber_of_pods()*0.1,
                basePlant.getBiological_weight()+basePlant.getBiological_weight()*0.1,
                basePlant.getSugar()+basePlant.getSugar()*0.1,
                basePlant.getRelative_water()+basePlant.getRelative_water()*0.1,
                basePlant.getChlorophyllA()+basePlant.getChlorophyllA()*0.1,
                basePlant.getChlorophyllB()+basePlant.getChlorophyllB()*0.1,
                basePlant.getProtein_percentage()+basePlant.getProtein_percentage()*0.1,
                basePlant.getLeaf_area_index()+basePlant.getLeaf_area_index()*0.1,
                basePlant.getSeed_yield_per_area()+basePlant.getSeed_yield_per_area()*0.1);

        Relations.rankingFunction(testPlant,new WeatherDay(
                2024.5,        // year (e.g., mid-2024)
                22.3,          // average temperature in °C
                28.0,          // max temperature in °C
                16.5,          // min temperature in °C
                5.6,           // rainfall in mm
                65.0,          // humidity in %
                12.4,          // wind speed in km/h
                18.7           // solar radiation in MJ/m²
        ));

        System.out.println("Final rating from temperature alone: "+ testPlant.getRanking());
        //Table table = Table.create("Test Table");
        //System.out.println(table.structure());
    }
}