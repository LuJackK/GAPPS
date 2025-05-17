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

    double ranking;

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

    public double getPlant_height() {
        return plant_height;
    }

    public void setPlant_height(double plant_height) {
        this.plant_height = plant_height;
    }

    public double getNumber_of_pods() {
        return number_of_pods;
    }

    public void setNumber_of_pods(double number_of_pods) {
        this.number_of_pods = number_of_pods;
    }

    public double getBiological_weight() {
        return biological_weight;
    }

    public void setBiological_weight(double biological_weight) {
        this.biological_weight = biological_weight;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getRelative_water() {
        return relative_water;
    }

    public void setRelative_water(double relative_water) {
        this.relative_water = relative_water;
    }

    public double getChlorophyllA() {
        return chlorophyllA;
    }

    public void setChlorophyllA(double chlorophyllA) {
        this.chlorophyllA = chlorophyllA;
    }

    public double getChlorophyllB() {
        return chlorophyllB;
    }

    public void setChlorophyllB(double chlorophyllB) {
        this.chlorophyllB = chlorophyllB;
    }

    public double getProtein_percentage() {
        return protein_percentage;
    }

    public void setProtein_percentage(double protein_percentage) {
        this.protein_percentage = protein_percentage;
    }

    public double getLeaf_area_index() {
        return leaf_area_index;
    }

    public void setLeaf_area_index(double leaf_area_index) {
        this.leaf_area_index = leaf_area_index;
    }

    public double getSeed_yield_per_area() {
        return seed_yield_per_area;
    }

    public void setSeed_yield_per_area(double seed_yield_per_area) {
        this.seed_yield_per_area = seed_yield_per_area;
    }

    public double getRanking() {
        return ranking;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }
}
