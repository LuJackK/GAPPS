package plant;
import ai.djl.*;
import ai.djl.nn.Activation;
import ai.djl.nn.Blocks;
import ai.djl.nn.SequentialBlock;
import ai.djl.nn.core.Linear;

public class defaultModel {
    int inputSize;
    int hiddenSize;
    int outputSize = 1;
    private Model model;
    public defaultModel(int inputSize, int hiddenSize, int noOfLayers){
        this.inputSize = inputSize;
        this.hiddenSize = hiddenSize;
        SequentialBlock block = new SequentialBlock();
        for(int i=0; i<noOfLayers; i++){
            block.add(Linear.builder().setUnits(hiddenSize).build());
            block.add(Activation::relu);
        }
        block.add(Linear.builder().setUnits(outputSize).build());
        this.model = Model.newInstance("plant-model");
        this.model.setBlock(block);
    }
    public Model getModel() {
        return this.model;
    }
}
