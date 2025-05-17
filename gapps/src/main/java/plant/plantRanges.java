package plant;

public class plantRanges {

    //1
    public static final double MIN_plant_height = 20; // height in cms
    public static final double MAX_plant_height = 100;

    //2
    public static final double MIN_number_of_pods = 10; // pods per plant
    public static final double MAX_number_of_pods = 300;

    //3
    public static final double MIN_biological_weight = 50; // grams
    public static final double MAX_biological_weight = 350;

    //4
    public static final double MIN_sugar = 1.0; // percentage (approx. % of fresh leaf/stem mass)
    public static final double MAX_sugar = 15.0; // in photosynthetically active tissues

    //5
    public static final double MIN_relative_water = 40.0; // percentage
    public static final double MAX_relative_water = 90.0; // ideal conditions

    //6
    public static final double MIN_chlorophyllA = 0.5; // logarithmic rassio
    public static final double MAX_chlorophyllA = 10;

    //7
    public static final double MIN_chlorophyllB = 0.2; // logarithmic rassio
    public static final double MAX_chlorophyllB = 8;

    //8
    public static final double MIN_protein_percentage = 30.0; // %
    public static final double MAX_protein_percentage = 45.0;

    //9
    public static final double MIN_leaf_area_index = 0.01; // LAI (dimensionless)
    public static final double MAX_leaf_area_index = 0.15;

    //10
    public static final double MIN_seed_yield_per_area = 1000; // kg/ha
    public static final double MAX_seed_yield_per_area = 9000;

}
