package main;
import GUI.ResultsPanel;
import GUI.VisualisationPanel;
import GUI.guiClass;
import geneticAlgo.GeneticAlgorithm;
import geneticAlgo.makePlant;
import plant.Plant;
import playground.WeatherDataLoader;
import playground.WeatherDay;
import playground.avgCalculations;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// ... other imports

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Plant Simulation");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            guiClass panel = new guiClass();
            frame.setContentPane(panel);
            frame.setVisible(true);

            panel.getGoButton().addActionListener(e -> {
                int initialPopulationSize = panel.getPopulationSize();
                int generations = panel.getGenerationCyclesPerYear();

                // Create the results panel
                ResultsPanel resultsPanel = new ResultsPanel("dataSets/Sprite-0003.gif");

                // Replace panel with resultsPanel
                frame.setContentPane(resultsPanel);
                frame.revalidate();
                frame.repaint();

                // Background task
                new SwingWorker<Void, String>() {
                    @Override
                    protected Void doInBackground() throws Exception {
                        Plant[] initialPop = new Plant[initialPopulationSize];
                        for (int i = 0; i < initialPopulationSize; i++) {
                            initialPop[i] = makePlant.randomPlant();
                        }

                        publish("Step 1 completed!");
                        GeneticAlgorithm g = new GeneticAlgorithm();
                        g.setGensPerYear(generations);

                        String weatherFile = "dataSets/ottawa_ks_weather.csv";
                        ArrayList<WeatherDay> weatherList = (ArrayList<WeatherDay>) WeatherDataLoader.loadWeatherData(weatherFile);
                        List<WeatherDay> avg = avgCalculations.calculateAvg(weatherList);

                        Plant[][] arrayOfBestTroughYears = new Plant[avg.size()][10];

                        for (int i = 0; i < avg.size(); i++) {
                            arrayOfBestTroughYears[i] = GeneticAlgorithm.testGeneration(initialPop, avg.get(i));
                            initialPop = GeneticAlgorithm.genCrossOver(arrayOfBestTroughYears[i], initialPopulationSize);
                            publish("Finished year: " + avg.get(i).getYear());
                        }

                        publish("Step 2 completed!");

                        for (int i = 0; i < arrayOfBestTroughYears.length; i++) {
                            double avgHeight = Arrays.stream(arrayOfBestTroughYears[i]).mapToDouble(Plant::getPlant_height).average().orElse(0);
                            double seedYield = Arrays.stream(arrayOfBestTroughYears[i]).mapToDouble(Plant::getSeed_yield_per_area).average().orElse(0);
                            publish("Year " + i + ": Height = " + avgHeight + ", Seed Yield = " + seedYield);
                        }
                        VisualisationPanel vizPanel = new VisualisationPanel(arrayOfBestTroughYears[0][0].toFeatureArray());
                        SwingUtilities.invokeLater(() -> {
                            frame.setContentPane(vizPanel);
                            frame.revalidate();
                            frame.repaint();
                        });
                        return null;
                    }

                    @Override
                    protected void process(List<String> chunks) {
                        for (String message : chunks) {
                            resultsPanel.appendText(message);
                        }
                    }
                }.execute();
            });
        });
    }
}
