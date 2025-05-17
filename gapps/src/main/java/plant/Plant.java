package plant;

public class Plant {
    private double plant_height;
    private double number_of_pods;
    private double biological_weight;
    private double sugar;
    private double relative_water;
    private double chlorophyllA; //      <=Chloro A663 from table
    private double chlorophyllB; //      <=Chloro A649 from table
    private double protein_percentage;
    private double leaf_area_index;
    private double seed_yield_per_area;

    public Plant(double plant_height, double number_of_pods, double biological_weight, double sugar, double relative_water, double chlorophyllA, double chlorophyllB, double protein_percentage, double leaf_area_index, double seed_yield_per_area) {
        this.plant_height = plant_height;
        this.number_of_pods = number_of_pods;
        this.biological_weight = biological_weight;
        this.sugar = sugar;
        this.relative_water = relative_water;
        this.chlorophyllA = chlorophyllA;
        this.chlorophyllB = chlorophyllB;
        this.protein_percentage = protein_percentage;
        this.leaf_area_index = leaf_area_index;
        this.seed_yield_per_area = seed_yield_per_area;
    }

}
