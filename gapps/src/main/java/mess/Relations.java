package mess;

import plant.DefaultPlant;
import plant.Plant;
import playground.Playground;
import playground.WeatherDay;

public class Relations {

    //gets conditions, and spitts out ranking as well as what are the specifics of the highest ranking plant
    public static void rankingFunction(Plant plant, WeatherDay year){

        double result =0;

        DefaultPlant def = new DefaultPlant();

        int weight=100;


        //averages
        double ideal_Temp=26.5;
        double ideal_maxTemp=32;
        double ideal_minTemp=15;

        double ideal_rainfall=600;
        double ideal_humidity=65;
        double ideal_windspeed=2;
        double ideal_solarRadiation=243;


        //TEMPERATURE
        if (year.getTemperature() > ideal_Temp) {

            //PlANT HEIGHT
            if (plant.getPlant_height() > def.getPlant_height()) {
                //Tall plants handle heat worse
                result = result - (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            } else {
                //Tall plants handle heat better
                result = result - (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            }



            //NUMBER OF PODS


            //BIOLOGICAL WEIGHT
            if (plant.getBiological_weight() > def.getBiological_weight()) {
                //The bigger the biological weight the better for temperature resistance
                result = result + (plant.getBiological_weight() - def.getBiological_weight())/ (def.MAX_biological_weight-def.getBiological_weight())*weight;
            } else {
                //The smaller the biological weight the better for temperature resistance
                result = result + (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            }


            //SUGARS
            if (plant.getSugar() > def.getSugar()) {
                //more sugar more resistent to temperature
                result = result + (plant.getSugar() - def.getSugar())/ (def.MAX_sugar-def.getSugar())*weight;
            } else {
                //The less sugar less plant is able to deal with temp
                result = result + (plant.getSugar() - def.getSugar())/ (def.MAX_sugar-def.getSugar())*weight;
            }




            //RELATIVE WATER
            if (plant.getRelative_water() > def.getRelative_water()) {
                //Its better to have more relative water when its hot
                result = result + (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water())*weight;
            } else {
                //Less relative water when its hot less of a score
                result =result + (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water())*weight;
            }



            //CHLOROPHYLA
            if (plant.getChlorophyllA() > def.getChlorophyllA()) {
                //Its better to have more chlorophilA when its warm
                result = result + (plant.getChlorophyllA() - def.getChlorophyllA())/ (def.MAX_chlorophyllA-def.getChlorophyllA())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result + (plant.getChlorophyllA() - def.getChlorophyllA())/ (def.MAX_chlorophyllA-def.getChlorophyllA())*weight;
            }


            //CHLOROPHYLB
            if (plant.getChlorophyllB() > def.getChlorophyllB()) {
                //Its better to have more chlorophilB when its warm
                result = result + (plant.getChlorophyllB() - def.getChlorophyllB())/ (def.MAX_chlorophyllB-def.getChlorophyllB())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result + (plant.getChlorophyllB() - def.getChlorophyllB())/ (def.MAX_chlorophyllB-def.getChlorophyllB())*weight;
            }

            //LEAF AREA
            if (plant.getLeaf_area_index() > def.getLeaf_area_index()) {
                //Its better to have more chlorophilB when its warm
                result = result + (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result + (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index())*weight;
            }


            //GET SEED YIELD
            if (plant.getSeed_yield_per_area() > def.getSeed_yield_per_area()) {
                //Sead YIeld is better to be low on high temps
                result = result - (plant.getSeed_yield_per_area() - def.getSeed_yield_per_area())/ (def.MAX_seed_yield_per_area-def.getSeed_yield_per_area())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result - (plant.getSeed_yield_per_area() - def.getSeed_yield_per_area())/ (def.MAX_seed_yield_per_area-def.getSeed_yield_per_area())*weight;
            }



        } else if (year.getTemperature() < ideal_Temp) {



            //PlANT HEIGHT
            if (!(plant.getPlant_height() > def.getPlant_height())){
                //Tall plants handle less heat better
                result = result - (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            } else {
                //Tall plants handle heat better
                result = result - (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            }

            //NUMBER OF PODS


            //BIOLOGICAL WEIGHT
            if (!(plant.getBiological_weight() > def.getBiological_weight())) {
                //The bigger the biological weight the better for temperature resistance
                result = result + (plant.getBiological_weight() - def.getBiological_weight())/ (def.MAX_biological_weight-def.getBiological_weight())*weight;
            } else {
                //The smaller the biological weight the better for temperature resistance
                result = result + (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            }


            //SUGARS
            if (!(plant.getSugar() > def.getSugar())) {
                //more sugar more resistent to temperature
                result = result + (plant.getSugar() - def.getSugar())/ (def.MAX_sugar-def.getSugar())*weight;
            } else {
                //The less sugar less plant is able to deal with temp
                result = result + (plant.getSugar() - def.getSugar())/ (def.MAX_sugar-def.getSugar())*weight;
            }


            //RELATIVE WATER
            if (!(plant.getRelative_water() > def.getRelative_water())) {
                //Its better to have more relative water when its hot
                result = result + (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water())*weight;
            } else {
                //Less relative water when its hot less of a score
                result =result + (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water())*weight;
            }



            //CHLOROPHYLA
            if (!(plant.getChlorophyllA() > def.getChlorophyllA())) {
                //Its better to have more chlorophilA when its warm
                result = result + (plant.getChlorophyllA() - def.getChlorophyllA())/ (def.MAX_chlorophyllA-def.getChlorophyllA())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result + (plant.getChlorophyllA() - def.getChlorophyllA())/ (def.MAX_chlorophyllA-def.getChlorophyllA())*weight;
            }



            //CHLOROPHYLB
            if (!(plant.getChlorophyllB() > def.getChlorophyllB())) {
                //Its better to have more chlorophilB when its warm
                result = result + (plant.getChlorophyllB() - def.getChlorophyllB())/ (def.MAX_chlorophyllB-def.getChlorophyllB())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result + (plant.getChlorophyllB() - def.getChlorophyllB())/ (def.MAX_chlorophyllB-def.getChlorophyllB())*weight;
            }


            //PROTEIN

            //LEAF AREA
            if (!(plant.getLeaf_area_index() > def.getLeaf_area_index())) {
                //Its better to have more chlorophilB when its warm
                result = result + (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result + (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index())*weight;
            }



            //GET SEED YIELD
            if (!(plant.getSeed_yield_per_area() > def.getSeed_yield_per_area())) {
                //Sead YIeld is better to be low on high temps
                result = result - (plant.getSeed_yield_per_area() - def.getSeed_yield_per_area())/ (def.MAX_seed_yield_per_area-def.getSeed_yield_per_area())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result - (plant.getSeed_yield_per_area() - def.getSeed_yield_per_area())/ (def.MAX_seed_yield_per_area-def.getSeed_yield_per_area())*weight;
            }

        }




        //MAX TEMP
        if (year.getMaxTemp()>=ideal_maxTemp){

        } else if (year.getMaxTemp()<ideal_maxTemp) {

        }






        //MIN TEMP
        if (year.getMinTemp()>=ideal_minTemp){

        } else if (year.getMinTemp()<ideal_minTemp) {

        }




        //RAINFALL
        if (year.getRainfall()>=ideal_rainfall){

            //PlANT HEIGHT
            if (plant.getPlant_height() > def.getPlant_height()) {
                //Tall plants handle rain worse
                result = result - (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            } else {
                //Tall plants handle rain better
                result = result - (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            }



            //NUMBER OF PODS
            if (plant.getNumber_of_pods() > def.getNumber_of_pods()) {
                //The bigger the number of pods better for rain resistance
                result = result + (plant.getNumber_of_pods() - def.getNumber_of_pods())/ (def.MAX_number_of_pods-def.getNumber_of_pods())*weight;
            } else {
                //The bigger the number of pods better for rain resistance
                result = result + (plant.getNumber_of_pods() - def.getNumber_of_pods())/ (def.MAX_number_of_pods-def.getNumber_of_pods())*weight;
            }


            //BIOLOGICAL WEIGHT
            if (plant.getBiological_weight() > def.getBiological_weight()) {
                //The bigger the biological weight the better for rainfall resistance
                result = result + (plant.getBiological_weight() - def.getBiological_weight())/ (def.MAX_biological_weight-def.getBiological_weight())*weight;
            } else {
                //The smaller the biological weight the better for temperature resistance
                result = result + (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            }



            //SUGARS
            if (plant.getSugar() > def.getSugar()) {
                //more suggar more suseptive to temperature
                result = result - (plant.getSugar() - def.getSugar())/ (def.MAX_sugar-def.getSugar())*weight;
            } else {
                //The less sugar less plant is able to deal with temp
                result = result - (plant.getSugar() - def.getSugar())/ (def.MAX_sugar-def.getSugar())*weight;
            }



            //RELATIVE WATER
            if (plant.getRelative_water() > def.getRelative_water()) {
                //More relative water less you are ressistant to rainfall
                result = result - (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water())*weight;
            } else {
                //Less relative water when its hot less of a score
                result =result - (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water())*weight;
            }




            //LEAF AREA
            if (plant.getLeaf_area_index() > def.getLeaf_area_index()) {
                //Bigger leafe area better during rainfall cos it collects wata
                result = result + (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result + (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index())*weight;
            }




            //GET SEED YIELD
            if (plant.getSeed_yield_per_area() > def.getSeed_yield_per_area()) {
                //Sead Yield is bigger when there is more rain
                result = result + (plant.getSeed_yield_per_area() - def.getSeed_yield_per_area())/ (def.MAX_seed_yield_per_area-def.getSeed_yield_per_area())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result + (plant.getSeed_yield_per_area() - def.getSeed_yield_per_area())/ (def.MAX_seed_yield_per_area-def.getSeed_yield_per_area())*weight;
            }






        } else if (year.getRainfall()<ideal_rainfall) {


            //PlANT HEIGHT
            if (!(plant.getPlant_height() > def.getPlant_height())) {
                //Tall plants handle rain worse
                result = result - (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            } else {
                //Tall plants handle rain better
                result = result - (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            }



            //NUMBER OF PODS
            if (!(plant.getNumber_of_pods() > def.getNumber_of_pods())) {
                //The bigger the number of pods better for rain resistance
                result = result + (plant.getNumber_of_pods() - def.getNumber_of_pods())/ (def.MAX_number_of_pods-def.getNumber_of_pods())*weight;
            } else {
                //The bigger the number of pods better for rain resistance
                result = result + (plant.getNumber_of_pods() - def.getNumber_of_pods())/ (def.MAX_number_of_pods-def.getNumber_of_pods())*weight;
            }


            //BIOLOGICAL WEIGHT
            if (!(plant.getBiological_weight() > def.getBiological_weight())) {
                //The bigger the biological weight the better for rainfall resistance
                result = result + (plant.getBiological_weight() - def.getBiological_weight())/ (def.MAX_biological_weight-def.getBiological_weight())*weight;
            } else {
                //The smaller the biological weight the better for temperature resistance
                result = result + (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            }




            //SUGARS
            if (!(plant.getSugar() > def.getSugar())) {
                //more suggar more suseptive to temperature
                result = result - (plant.getSugar() - def.getSugar())/ (def.MAX_sugar-def.getSugar())*weight;
            } else {
                //The less sugar less plant is able to deal with temp
                result = result - (plant.getSugar() - def.getSugar())/ (def.MAX_sugar-def.getSugar())*weight;
            }





            //RELATIVE WATER
            if (!(plant.getRelative_water() > def.getRelative_water())) {
                //More relative water less you are ressistant to rainfall
                result = result - (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water())*weight;
            } else {
                //Less relative water when its hot less of a score
                result =result - (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water())*weight;
            }




            //LEAF AREA
            if (!(plant.getLeaf_area_index() > def.getLeaf_area_index())) {
                //Bigger leafe area better during rainfall cos it collects wata
                result = result + (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result + (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index())*weight;
            }



            //GET SEED YIELD
            if (!(plant.getSeed_yield_per_area() > def.getSeed_yield_per_area())) {
                //Sead Yield is bigger when there is more rain
                result = result + (plant.getSeed_yield_per_area() - def.getSeed_yield_per_area())/ (def.MAX_seed_yield_per_area-def.getSeed_yield_per_area())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result + (plant.getSeed_yield_per_area() - def.getSeed_yield_per_area())/ (def.MAX_seed_yield_per_area-def.getSeed_yield_per_area())*weight;
            }



        }




        //HUMIDITY
        if (year.getHumidity()>=ideal_humidity){
            //PlANT HEIGHT
            if (plant.getPlant_height() > def.getPlant_height()) {
                //Tall plants handle rain better
                result = result + (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            } else {
                //Tall plants handle rain better
                result = result + (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            }



            //NUMBER OF PODS
            if (plant.getNumber_of_pods() > def.getNumber_of_pods()) {
                //The bigger the number of pods better for humidity
                result = result + (plant.getNumber_of_pods() - def.getNumber_of_pods())/ (def.MAX_number_of_pods-def.getNumber_of_pods())*weight;
            } else {
                //The bigger the number of pods better for rain resistance
                result = result + (plant.getNumber_of_pods() - def.getNumber_of_pods())/ (def.MAX_number_of_pods-def.getNumber_of_pods())*weight;
            }





            //SUGARS
            if (plant.getSugar() > def.getSugar()) {
                //more sugar better you are addapted to humidity
                result = result + (plant.getSugar() - def.getSugar())/ (def.MAX_sugar-def.getSugar())*weight;
            } else {

                result = result + (plant.getSugar() - def.getSugar())/ (def.MAX_sugar-def.getSugar())*weight;
            }




            //RELATIVE WATER
            if (plant.getRelative_water() > def.getRelative_water()) {
                //Les relative water to humidity
                result = result - (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water())*weight;
            } else {
                //Les relative water to humidity
                result =result - (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water())*weight;
            }




            //LEAF AREA
            if (plant.getLeaf_area_index() > def.getLeaf_area_index()) {
                //Bigger leafe area better transpiration and humidity
                result = result + (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result + (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index())*weight;
            }




            //GET SEED YIELD
            if (plant.getSeed_yield_per_area() > def.getSeed_yield_per_area()) {
                //Sead Yield is bigger when there is more humidity
                result = result + (plant.getSeed_yield_per_area() - def.getSeed_yield_per_area())/ (def.MAX_seed_yield_per_area-def.getSeed_yield_per_area())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result + (plant.getSeed_yield_per_area() - def.getSeed_yield_per_area())/ (def.MAX_seed_yield_per_area-def.getSeed_yield_per_area())*weight;
            }

        } else if (year.getHumidity()<ideal_humidity) {

            //PlANT HEIGHT
            if (!(plant.getPlant_height() > def.getPlant_height())) {
                //Tall plants handle rain better
                result = result + (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            } else {
                //Tall plants handle rain better
                result = result + (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            }



            //NUMBER OF PODS
            if (!(plant.getNumber_of_pods() > def.getNumber_of_pods())) {
                //The bigger the number of pods better for humidity
                result = result + (plant.getNumber_of_pods() - def.getNumber_of_pods())/ (def.MAX_number_of_pods-def.getNumber_of_pods())*weight;
            } else {
                //The bigger the number of pods better for rain resistance
                result = result + (plant.getNumber_of_pods() - def.getNumber_of_pods())/ (def.MAX_number_of_pods-def.getNumber_of_pods())*weight;
            }





            //SUGARS
            if (!(plant.getSugar() > def.getSugar())) {
                //more sugar better you are addapted to humidity
                result = result + (plant.getSugar() - def.getSugar())/ (def.MAX_sugar-def.getSugar())*weight;
            } else {

                result = result + (plant.getSugar() - def.getSugar())/ (def.MAX_sugar-def.getSugar())*weight;
            }




            //RELATIVE WATER
            if (!(plant.getRelative_water() > def.getRelative_water())) {
                //Les relative water to humidity
                result = result - (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water())*weight;
            } else {
                //Les relative water to humidity
                result =result - (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water())*weight;
            }




            //LEAF AREA
            if (!(plant.getLeaf_area_index() > def.getLeaf_area_index())) {
                //Bigger leafe area better transpiration and humidity
                result = result + (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result + (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index())*weight;
            }



            //GET SEED YIELD
            if (!(plant.getSeed_yield_per_area() > def.getSeed_yield_per_area())) {
                //Sead Yield is bigger when there is more humidity
                result = result + (plant.getSeed_yield_per_area() - def.getSeed_yield_per_area())/ (def.MAX_seed_yield_per_area-def.getSeed_yield_per_area())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result + (plant.getSeed_yield_per_area() - def.getSeed_yield_per_area())/ (def.MAX_seed_yield_per_area-def.getSeed_yield_per_area())*weight;
            }
        }





        //WINDSPEED
        if (year.getWindSpeed()>=ideal_windspeed){

            //PlANT HEIGHT
            if (plant.getPlant_height() > def.getPlant_height()) {
                //Tall plants handle winds worse
                result = result - (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            } else {
                //Tall plants handle heat better
                result = result - (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            }



            //NUMBER OF PODS
            if ((plant.getNumber_of_pods() > def.getNumber_of_pods())) {
                //The bigger the number of pods better for wind
                result = result + (plant.getNumber_of_pods() - def.getNumber_of_pods())/ (def.MAX_number_of_pods-def.getNumber_of_pods())*weight;
            } else {
                //The bigger the number of pods better for wind resistance
                result = result + (plant.getNumber_of_pods() - def.getNumber_of_pods())/ (def.MAX_number_of_pods-def.getNumber_of_pods())*weight;
            }

            //BIOLOGICAL WEIGHT
            if (plant.getBiological_weight() > def.getBiological_weight()) {
                //The bigger the biological weight the better for temperature resistance
                result = result + (plant.getBiological_weight() - def.getBiological_weight())/ (def.MAX_biological_weight-def.getBiological_weight())*weight;
            } else {
                //The smaller the biological weight the better for temperature resistance
                result = result + (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            }




            //RELATIVE WATER
            if (plant.getRelative_water() > def.getRelative_water()) {
                //Its better to have more relative water when its windy
                result = result + (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water())*weight;
            } else {
                //Less relative water when its hot less of a score
                result =result + (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water())*weight;
            }




            //LEAF AREA
            if (plant.getLeaf_area_index() > def.getLeaf_area_index()) {
                //Its better to have more chlorophilB when its warm
                result = result - (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result - (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index())*weight;
            }



            //GET SEED YIELD
            if (plant.getSeed_yield_per_area() > def.getSeed_yield_per_area()) {
                //Sead YIeld is better to be low on high temps
                result = result - (plant.getSeed_yield_per_area() - def.getSeed_yield_per_area())/ (def.MAX_seed_yield_per_area-def.getSeed_yield_per_area())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result - (plant.getSeed_yield_per_area() - def.getSeed_yield_per_area())/ (def.MAX_seed_yield_per_area-def.getSeed_yield_per_area())*weight;
            }






        } else if (year.getWindSpeed()<ideal_windspeed) {
            //PlANT HEIGHT
            if (!(plant.getPlant_height() > def.getPlant_height())) {
                //Tall plants handle winds worse
                result = result - (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            } else {
                //Tall plants handle heat better
                result = result - (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            }



            //NUMBER OF PODS
            if (!(plant.getNumber_of_pods() > def.getNumber_of_pods())) {
                //The bigger the number of pods better for wind
                result = result + (plant.getNumber_of_pods() - def.getNumber_of_pods())/ (def.MAX_number_of_pods-def.getNumber_of_pods())*weight;
            } else {
                //The bigger the number of pods better for wind resistance
                result = result + (plant.getNumber_of_pods() - def.getNumber_of_pods())/ (def.MAX_number_of_pods-def.getNumber_of_pods())*weight;
            }

            //BIOLOGICAL WEIGHT
            if (!(plant.getBiological_weight() > def.getBiological_weight())) {
                //The bigger the biological weight the better for temperature resistance
                result = result + (plant.getBiological_weight() - def.getBiological_weight())/ (def.MAX_biological_weight-def.getBiological_weight())*weight;
            } else {
                //The smaller the biological weight the better for temperature resistance
                result = result + (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            }




            //RELATIVE WATER
            if (!(plant.getRelative_water() > def.getRelative_water())) {
                //Its better to have more relative water when its windy
                result = result + (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water())*weight;
            } else {
                //Less relative water when its hot less of a score
                result =result + (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water())*weight;
            }




            //LEAF AREA
            if (!(plant.getLeaf_area_index() > def.getLeaf_area_index())) {
                //Its better to have more chlorophilB when its warm
                result = result - (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result - (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index())*weight;
            }



            //GET SEED YIELD
            if (!(plant.getSeed_yield_per_area() > def.getSeed_yield_per_area())) {
                //Sead YIeld is better to be low on high temps
                result = result - (plant.getSeed_yield_per_area() - def.getSeed_yield_per_area())/ (def.MAX_seed_yield_per_area-def.getSeed_yield_per_area())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result - (plant.getSeed_yield_per_area() - def.getSeed_yield_per_area())/ (def.MAX_seed_yield_per_area-def.getSeed_yield_per_area())*weight;
            }



        }



        //SOLARRADIATION
        if (year.getSolarRadiation()>=ideal_solarRadiation){

            //PlANT HEIGHT
            if (plant.getPlant_height() > def.getPlant_height()) {
                //Tall plants handle sun worse
                result = result - (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            } else {
                //Tall plants handle sun better
                result = result - (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            }






            //RELATIVE WATER
            if (plant.getRelative_water() > def.getRelative_water()) {
                //Its better to have more relative water when its windy
                result = result + (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water())*weight;
            } else {
                //Less relative water when its hot less of a score
                result =result + (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water())*weight;
            }




            //LEAF AREA
            if (plant.getLeaf_area_index() > def.getLeaf_area_index()) {
                //Its better to have more chlorophilB when its warm
                result = result - (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result - (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index())*weight;
            }



        } else if (year.getSolarRadiation()<ideal_solarRadiation) {


            //PlANT HEIGHT
            if (!(plant.getPlant_height() > def.getPlant_height())) {
                //Tall plants handle sun worse
                result = result - (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            } else {
                //Tall plants handle sun better
                result = result - (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height())*weight;
            }






            //RELATIVE WATER
            if (!(plant.getRelative_water() > def.getRelative_water())) {
                //Its better to have more relative water when its windy
                result = result + (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water())*weight;
            } else {
                //Less relative water when its hot less of a score
                result =result + (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water())*weight;
            }




            //LEAF AREA
            if (!(plant.getLeaf_area_index() > def.getLeaf_area_index())) {
                //Its better to have more chlorophilB when its warm
                result = result - (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index())*weight;
            } else {
                //Less relative water when its hot less of a score
                result = result - (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index())*weight;
            }




        }


        plant.setRanking(result);

    }

}