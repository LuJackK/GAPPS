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
                result = result - (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height());
            } else {
                //Tall plants handle heat better
                result = result - (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height());
            }

            System.out.println("Result right now: "+ result);

            //NUMBER OF PODS


            //BIOLOGICAL WEIGHT
            if (plant.getBiological_weight() > def.getBiological_weight()) {
                //The bigger the biological weight the better for temperature resistance
                result = result + (plant.getBiological_weight() - def.getBiological_weight())/ (def.MAX_biological_weight-def.getBiological_weight());
            } else {
                //The smaller the biological weight the better for temperature resistance
                result = result + (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height());
            }

            System.out.println("Result right now: "+ result);

            //SUGARS
            if (plant.getSugar() > def.getSugar()) {
                //more sugar more resistent to temperature
                result = result + (plant.getSugar() - def.getSugar())/ (def.MAX_sugar-def.getSugar());
            } else {
                //The less sugar less plant is able to deal with temp
                result = result + (plant.getSugar() - def.getSugar())/ (def.MAX_sugar-def.getSugar());
            }

            System.out.println("Result right now: "+ result);


            //RELATIVE WATER
            if (plant.getRelative_water() > def.getRelative_water()) {
                //Its better to have more relative water when its hot
                result = result + (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water());
            } else {
                //Less relative water when its hot less of a score
                result =result + (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water());
            }

            System.out.println("Result right now: "+ result);

            //CHLOROPHYLA
            if (plant.getChlorophyllA() > def.getChlorophyllA()) {
                //Its better to have more chlorophilA when its warm
                result = result + (plant.getChlorophyllA() - def.getChlorophyllA())/ (def.MAX_chlorophyllA-def.getChlorophyllA());
            } else {
                //Less relative water when its hot less of a score
                result = result + (plant.getChlorophyllA() - def.getChlorophyllA())/ (def.MAX_chlorophyllA-def.getChlorophyllA());
            }

            System.out.println("Result right now: "+ result);

            //CHLOROPHYLB
            if (plant.getChlorophyllB() > def.getChlorophyllB()) {
                //Its better to have more chlorophilB when its warm
                result = result + (plant.getChlorophyllB() - def.getChlorophyllB())/ (def.MAX_chlorophyllB-def.getChlorophyllB());
            } else {
                //Less relative water when its hot less of a score
                result = result + (plant.getChlorophyllB() - def.getChlorophyllB())/ (def.MAX_chlorophyllB-def.getChlorophyllB());
            }

            System.out.println("Result right now: "+ result);
            //PROTEIN

            //LEAF AREA
            if (plant.getLeaf_area_index() > def.getLeaf_area_index()) {
                //Its better to have more chlorophilB when its warm
                result = result + (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index());
            } else {
                //Less relative water when its hot less of a score
                result = result + (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index());
            }

            System.out.println("Result right now: "+ result);

            //GET SEED YIELD
            if (plant.getSeed_yield_per_area() > def.getSeed_yield_per_area()) {
                //Sead YIeld is better to be low on high temps
                result = result - (plant.getSeed_yield_per_area() - def.getSeed_yield_per_area())/ (def.MAX_seed_yield_per_area-def.getSeed_yield_per_area());
            } else {
                //Less relative water when its hot less of a score
                result = result - (plant.getSeed_yield_per_area() - def.getSeed_yield_per_area())/ (def.MAX_seed_yield_per_area-def.getSeed_yield_per_area());
            }

            System.out.println("Result right now: "+ result);



        } else if (year.getTemperature() < ideal_Temp) {



            //PlANT HEIGHT
            if (!(plant.getPlant_height() > def.getPlant_height())){
                //Tall plants handle less heat better
                result = result - (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height());
            } else {
                //Tall plants handle heat better
                result = result - (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height());
            }

            System.out.println("Result right now: "+ result);
            //NUMBER OF PODS


            //BIOLOGICAL WEIGHT
            if (!(plant.getBiological_weight() > def.getBiological_weight())) {
                //The bigger the biological weight the better for temperature resistance
                result = result + (plant.getBiological_weight() - def.getBiological_weight())/ (def.MAX_biological_weight-def.getBiological_weight());
            } else {
                //The smaller the biological weight the better for temperature resistance
                result = result + (plant.getPlant_height() - def.getPlant_height())/ (def.MAX_plant_height-def.getPlant_height());
            }

            System.out.println("Result right now: "+ result);

            //SUGARS
            if (!(plant.getSugar() > def.getSugar())) {
                //more sugar more resistent to temperature
                result = result + (plant.getSugar() - def.getSugar())/ (def.MAX_sugar-def.getSugar());
            } else {
                //The less sugar less plant is able to deal with temp
                result = result + (plant.getSugar() - def.getSugar())/ (def.MAX_sugar-def.getSugar());
            }

            System.out.println("Result right now: "+ result);

            //RELATIVE WATER
            if (!(plant.getRelative_water() > def.getRelative_water())) {
                //Its better to have more relative water when its hot
                result = result + (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water());
            } else {
                //Less relative water when its hot less of a score
                result =result + (plant.getRelative_water() - def.getRelative_water())/ (def.MAX_relative_water-def.getRelative_water());
            }


            System.out.println("Result right now: "+ result);

            //CHLOROPHYLA
            if (!(plant.getChlorophyllA() > def.getChlorophyllA())) {
                //Its better to have more chlorophilA when its warm
                result = result + (plant.getChlorophyllA() - def.getChlorophyllA())/ (def.MAX_chlorophyllA-def.getChlorophyllA());
            } else {
                //Less relative water when its hot less of a score
                result = result + (plant.getChlorophyllA() - def.getChlorophyllA())/ (def.MAX_chlorophyllA-def.getChlorophyllA());
            }


            System.out.println("Result right now: "+ result);

            //CHLOROPHYLB
            if (!(plant.getChlorophyllB() > def.getChlorophyllB())) {
                //Its better to have more chlorophilB when its warm
                result = result + (plant.getChlorophyllB() - def.getChlorophyllB())/ (def.MAX_chlorophyllB-def.getChlorophyllB());
            } else {
                //Less relative water when its hot less of a score
                result = result + (plant.getChlorophyllB() - def.getChlorophyllB())/ (def.MAX_chlorophyllB-def.getChlorophyllB());
            }

            System.out.println("Result right now: "+ result);
            //PROTEIN

            //LEAF AREA
            if (!(plant.getLeaf_area_index() > def.getLeaf_area_index())) {
                //Its better to have more chlorophilB when its warm
                result = result + (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index());
            } else {
                //Less relative water when its hot less of a score
                result = result + (plant.getLeaf_area_index() - def.getLeaf_area_index())/ (def.MAX_leaf_area_index-def.getLeaf_area_index());
            }

            System.out.println("Result right now: "+ result);

            //GET SEED YIELD
            if (!(plant.getSeed_yield_per_area() > def.getSeed_yield_per_area())) {
                //Sead YIeld is better to be low on high temps
                result = result - (plant.getSeed_yield_per_area() - def.getSeed_yield_per_area())/ (def.MAX_seed_yield_per_area-def.getSeed_yield_per_area());
            } else {
                //Less relative water when its hot less of a score
                result = result - (plant.getSeed_yield_per_area() - def.getSeed_yield_per_area())/ (def.MAX_seed_yield_per_area-def.getSeed_yield_per_area());
            }

            System.out.println("Result right now: "+ result);


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

        } else if (year.getRainfall()<ideal_rainfall) {

        }




        //HUMIDITY
        if (year.getHumidity()>=ideal_humidity){

        } else if (year.getHumidity()<ideal_humidity) {

        }





        //WINDSPEED
        if (year.getWindSpeed()>=ideal_windspeed){

        } else if (year.getWindSpeed()<ideal_windspeed) {

        }



        //SOLARRADIATION
        if (year.getSolarRadiation()>=ideal_solarRadiation){

        } else if (year.getSolarRadiation()<ideal_solarRadiation) {

        }



        plant.setRanking(result);

    }

}
