package geneticAlgo;

import mess.Relations;
import plant.Plant;
import playground.WeatherDay;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class GeneticAlgorithm {

    static public final int gensPerYear=5;
    static Random r=new Random();

    //need to discuss beginning population size ~1000
    static public final int numOfChosenOnes=10;



    public static Plant[] testGeneration(Plant[] plantArray, WeatherDay year){

        Plant[] bestOnes=new Plant[numOfChosenOnes];

        for (int i = 0; i < numOfChosenOnes; i++) {
            bestOnes[i] = plantArray[i];
        }

        for (int i = 0; i <gensPerYear; i++) {

            for (int j = 0; j < plantArray.length; j++) {

                Relations.rankingFunction(plantArray[j],year);



                // Try inserting into bestOnes if better than the current lowest
                double score = plantArray[j].getRanking();


                // Find the lowest ranking plant in bestOnes
                int minIndex = 0;
                double minRanking = bestOnes[0].getRanking();
                for (int k = 1; k < numOfChosenOnes; k++) {
                    if (bestOnes[k].getRanking() < minRanking) {
                        minRanking = bestOnes[k].getRanking();
                        minIndex = k;
                    }
                }

                // Replace if current plant has better ranking
                if (score > minRanking) {
                    bestOnes[minIndex] = plantArray[j];
                }

                //System.out.println("Relation ranking function: "+j);
                //plant .ranking
            }

            //highest ranking eis gona be first


            System.out.println("Generation: "+i);


            for (int j = 0; j < numOfChosenOnes; j++) {
                bestOnes[j]=plantArray[j]; //get the first how ever many so we can do crossover with them
            }


            plantArray=genCrossOver(bestOnes,plantArray.length);

        }

        return bestOnes; //returns best one in this year afternumOfChosenOnes

    }



    public static Plant[] genCrossOver(Plant[] parents, int sizeOfOriginalPopulation){

        int half=sizeOfOriginalPopulation/2;



        //percantage of randomly generated
        //percentage of inharit from parents
        //save the parents as well
        Plant[] returningArr=new Plant[sizeOfOriginalPopulation];

        //keep the parents
        for (int i = 0; i < parents.length; i++) {
            returningArr[i]=parents[i];
        }

        //first 10 keep parents next 490 make random
        for (int i = 0; i < half-parents.length; i++) {
            returningArr[i+parents.length]=makePlant.randomPlant();
        }






        for (int i = 0; i < half; i++) {

            Plant parent1 = parents[r.nextInt(parents.length)];
            Plant parent2 = parents[r.nextInt(parents.length)];

            Plant plant = new Plant(
                    r.nextBoolean() ? parent1.getPlant_height() : parent2.getPlant_height(),
                    r.nextBoolean() ? parent1.getNumber_of_pods() : parent2.getNumber_of_pods(),
                    r.nextBoolean() ? parent1.getBiological_weight() : parent2.getBiological_weight(),
                    r.nextBoolean() ? parent1.getSugar() : parent2.getSugar(),
                    r.nextBoolean() ? parent1.getRelative_water() : parent2.getRelative_water(),
                    r.nextBoolean() ? parent1.getChlorophyllA() : parent2.getChlorophyllA(),
                    r.nextBoolean() ? parent1.getChlorophyllB() : parent2.getChlorophyllB(),
                    r.nextBoolean() ? parent1.getProtein_percentage() : parent2.getProtein_percentage(),
                    r.nextBoolean() ? parent1.getLeaf_area_index() : parent2.getLeaf_area_index(),
                    r.nextBoolean() ? parent1.getSeed_yield_per_area() : parent2.getSeed_yield_per_area()
            );

            returningArr[half+i]=plant;
        }

        return returningArr;
    }
}
