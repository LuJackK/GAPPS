package main;
import ai.djl.engine.Engine;
import plant.defaultPlant;
import ai.djl.engine.Engine;
import ai.djl.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        defaultPlant basePlant = new defaultPlant();

        System.out.println("DJL Engine: " + Engine.getInstance().getEngineName());




        //Table table = Table.create("Test Table");
        //System.out.println(table.structure());
    }
}