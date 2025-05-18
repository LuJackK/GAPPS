package geneticAlgo;

import plant.DefaultPlant;
import plant.Plant;

import java.util.Random;


public class makePlant {
    private static Random rand = new Random();
    private static final DefaultPlant def = new DefaultPlant();





    public static Plant randomPlant() {

        return new Plant(
                randomBetween(def.MIN_plant_height, def.MAX_plant_height),
                randomBetween(def.MIN_number_of_pods, def.MAX_number_of_pods),
                randomBetween(def.MIN_biological_weight, def.MAX_biological_weight),
                randomBetween(def.MIN_sugar, def.MAX_sugar),
                randomBetween(def.MIN_relative_water, def.MAX_relative_water),
                randomBetween(def.MIN_chlorophyllA, def.MAX_chlorophyllA),
                randomBetween(def.MIN_chlorophyllB, def.MAX_chlorophyllB),
                randomBetween(def.MIN_protein_percentage, def.MAX_protein_percentage),
                randomBetween(def.MIN_leaf_area_index, def.MAX_leaf_area_index),
                randomBetween(def.MIN_seed_yield_per_area, def.MAX_seed_yield_per_area)
        );
    }

    private static double randomBetween(double min, double max) {
        return min + rand.nextDouble() * (max - min);
    }
}