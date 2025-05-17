package geneticAlgo;

import mess.Relations;
import plant.Plant;
import playground.WeatherDay;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class GeneticAlgorithm {

    static public final int gensPerYear=100;
    static Random r=new Random();

    //need to discuss beginning population size ~1000
    static public final int numOfChosenOnes=10;


    static void testGeneration(Plant[] plantArray, WeatherDay year){




        for (int i = 0; i <gensPerYear; i++) {

            for (int j = 0; j < plantArray.length; j++) {
                Relations.rankingFunction(plantArray[j],year);




                //lukas evaulation engine
            }

            Arrays.sort(plantArray, Comparator.comparingDouble(Plant::getRanking).reversed()); //highest ranking is gona be first


            Plant[] bestOnes=new Plant[numOfChosenOnes];

            for (int j = 0; j < numOfChosenOnes; j++) {
                bestOnes[j]=plantArray[j]; //get the first how ever many so we can do crossover with them
            }

            plantArray=genCrossOver(bestOnes,plantArray.length);

        }
    }

    static Plant[] genCrossOver(Plant[] parents, int sizeOfOriginalPopulation){
        //percantage of randomly generated
        //percentage of inharit from parents
        //save the parents as well
        Plant[] returningArr=new Plant[sizeOfOriginalPopulation];

        //keep the parents
        for (int i = 0; i < parents.length; i++) {
            returningArr[i]=parents[i];
        }

        //first 10 keep parents next 490 make random
        for (int i = 0; i < 490; i++) {
            returningArr[i+10]=makePlant.randomPlant();
        }

        Plant parent1 = parents[r.nextInt(parents.length)];
        Plant parent2 = parents[r.nextInt(parents.length)];



        Plant plant=new Plant(0,0,0,0,0,0,0,0,0,0);

        plant.setPlant_height(r.nextBoolean() ? parent1.getPlant_height() : parent2.getPlant_height());
        plant.setNumber_of_pods(r.nextBoolean() ? parent1.getNumber_of_pods() : parent2.getNumber_of_pods());
        plant.setBiological_weight(r.nextBoolean() ? parent1.getBiological_weight() : parent2.getBiological_weight());
        plant.setPlant_height(r.nextBoolean() ? parent1.getPlant_height() : parent2.getPlant_height());
        plant.setPlant_height(r.nextBoolean() ? parent1.getPlant_height() : parent2.getPlant_height());
        plant.setPlant_height(r.nextBoolean() ? parent1.getPlant_height() : parent2.getPlant_height());




        return returningArr;


    }
}
