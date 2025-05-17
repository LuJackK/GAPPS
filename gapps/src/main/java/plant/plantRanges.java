package plant;

public class plantRanges {

    public static final double MIN_plant_height = 0.2; // meters (20 cm)
    public static final double MAX_plant_height = 1.5; // meters (150 cm)

    public static final double MIN_number_of_pods = 10; // pods per plant
    public static final double MAX_number_of_pods = 300; // pods per plant

    public static final double MIN_biological_weight = 0.05; // kg (50 grams per plant)
    public static final double MAX_biological_weight = 0.5; // kg (dry weight per plant)

    public static final double MIN_sugar = 2.0; // percentage (approx. % of fresh leaf/stem mass)
    public static final double MAX_sugar = 15.0; // in photosynthetically active tissues

    public static final double MIN_relative_water = 40.0; // percentage (leaf relative water content)
    public static final double MAX_relative_water = 90.0; // ideal conditions

    public static final double MIN_chlorophyllA = 0.5; // mg/g fresh weight
    public static final double MAX_chlorophyllA = 3.0; // mg/g fresh weight

    public static final double MIN_chlorophyllB = 0.2; // mg/g fresh weight
    public static final double MAX_chlorophyllB = 1.2; // mg/g fresh weight

    public static final double MIN_protein_percentage = 30.0; // % of seed dry mass
    public static final double MAX_protein_percentage = 45.0; // very high for soybeans

    public static final double MIN_leaf_area_index = 1.0; // LAI (dimensionless)
    public static final double MAX_leaf_area_index = 6.0; // at canopy closure

    public static final double MIN_seed_yield_per_area = 1000; // kg/ha (low yield)
    public static final double MAX_seed_yield_per_area = 5000; // kg/ha (excellent yield)

}
