package plant;

import tech.tablesaw.api.Table;


public class DefaultPlant {


    //Table data= Table.read().csv("/Users/al/GAPPS/gapps/dataSets/Advanced Soybean Agricultural Dataset.csv");
    Table data= Table.read().csv("./dataSets/Advanced Soybean Agricultural Dataset.csv");



    private double plant_height=data.numberColumn(2).mean();
    private double number_of_pods=data.numberColumn(3).mean();
    private double biological_weight=data.numberColumn(4).mean();
    private double sugar=data.numberColumn(5).mean();
    private double relative_water=data.numberColumn(6).mean();
    private double chlorophyllA=data.numberColumn(7).mean(); //      <=Chloro A663 from table
    private double chlorophyllB=data.numberColumn(8).mean(); //      <=Chloro A649 from table
    private double protein_percentage=data.numberColumn(9).mean();
    private double leaf_area_index=data.numberColumn(11).mean();
    private double seed_yield_per_area=data.numberColumn(12).mean();





    public double MIN_plant_height = data.numberColumn(2).min(); // height in cms
    public  double MAX_plant_height = data.numberColumn(2).max();

    //2
    public double MIN_number_of_pods = data.numberColumn(3).min(); // pods per plant
    public double MAX_number_of_pods = data.numberColumn(3).max();

    //3
    public  double MIN_biological_weight = data.numberColumn(4).min(); // pods per plant
    public double MAX_biological_weight = data.numberColumn(4).max(); // pods per plant;

    //4
    public  double MIN_sugar = data.numberColumn(5).min(); // pods per plant// percentage (approx. % of fresh leaf/stem mass)
    public  double MAX_sugar = data.numberColumn(5).max();; // in photosynthetically active tissues

    //5
    public double MIN_relative_water = data.numberColumn(6).min(); // percentage
    public double MAX_relative_water =data.numberColumn(6).max(); // ideal conditions

    //6
    public  double MIN_chlorophyllA =data.numberColumn(7).min();; // logarithmic rassio
    public  double MAX_chlorophyllA =data.numberColumn(7).max();

    //7
    public double MIN_chlorophyllB = data.numberColumn(8).min();; // logarithmic rassio
    public double MAX_chlorophyllB = data.numberColumn(8).max();

    //8
    public double MIN_protein_percentage = data.numberColumn(9).min();; // %
    public double MAX_protein_percentage = data.numberColumn(9).max();

    //9
    public double MIN_leaf_area_index = data.numberColumn(9).min(); // LAI (dimensionless)
    public double MAX_leaf_area_index = data.numberColumn(9).max();;

    //10
    public double MIN_seed_yield_per_area = data.numberColumn(10).min();; // kg/ha
    public double MAX_seed_yield_per_area = data.numberColumn(10).max();





    public DefaultPlant() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("Plant height AVG        : "+plant_height);
        System.out.println("Number of pods AVG      : "+number_of_pods);
        System.out.println("Bio weight of plant AVG : "+biological_weight);
        System.out.println("Sugar percentage AVG    : "+sugar);
        System.out.println("Relative water AVG      : "+relative_water);
        System.out.println("ChrolophylA AVG         : "+chlorophyllA);
        System.out.println("ChrolophylB AVG         : "+chlorophyllB);
        System.out.println("Leaf area index AVG     : "+leaf_area_index);
        System.out.println("Seed leave per area AVG : "+seed_yield_per_area);
        //.......

        System.out.println("---------------------------------------------------------------");

        System.out.println();
        //System.out.println(data.structure());
        //System.out.println();
    }


    public double getPlant_height() {
        return plant_height;
    }

    public double getNumber_of_pods() {
        return number_of_pods;
    }

    public double getBiological_weight() {
        return biological_weight;
    }

    public double getSugar() {
        return sugar;
    }

    public double getRelative_water() {
        return relative_water;
    }

    public double getChlorophyllA() {
        return chlorophyllA;
    }

    public double getChlorophyllB() {
        return chlorophyllB;
    }

    public double getProtein_percentage() {
        return protein_percentage;
    }

    public double getLeaf_area_index() {
        return leaf_area_index;
    }

    public double getSeed_yield_per_area() {
        return seed_yield_per_area;
    }


}
