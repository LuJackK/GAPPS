package plant;

import tech.tablesaw.api.Table;


public class BasePlant extends plantRanges{


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
    private double weight_300_seeds=data.numberColumn(10).mean();
    private double leaf_area_index=data.numberColumn(11).mean();
    private double seed_yield_per_area=data.numberColumn(12).mean();


    public BasePlant() {
        System.out.println("Hello");
        System.out.println(plant_height);
        System.out.println(number_of_pods);
        System.out.println(biological_weight);
        System.out.println(sugar);
        System.out.println(relative_water);
        System.out.println(chlorophyllA);
        System.out.println(number_of_pods);
        //.......


        System.out.println(data.structure());
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

    public double getWeight_300_seeds() {
        return weight_300_seeds;
    }

    public double getLeaf_area_index() {
        return leaf_area_index;
    }

    public double getSeed_yield_per_area() {
        return seed_yield_per_area;
    }


}
