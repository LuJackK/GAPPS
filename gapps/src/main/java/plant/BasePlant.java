package plant;

import tech.tablesaw.api.Table;


public class BasePlant {


    Table data= Table.read().csv("../dataSets/Advanced Soybean Agricultural Dataset.csv");

    private float plant_height;
    private float number_of_pods;
    private float biological_weight;
    private float sugar;
    private float relative_water;
    private float chlorophyllA; //      <=Chloro A663 from table
    private float chlorophyllB; //      <=Chloro A649 from table
    private float protein_percentage;

    public BasePlant() {
        System.out.println(data.structure());
    }
}
