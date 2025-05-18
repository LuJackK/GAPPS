package GUI;

import javax.swing.*;
import java.awt.*;

public class VisualisationPanel extends JPanel {
    private double[] stats;
    private String[] labels = {
            "Plant Height ",
            "Number of Pods",
            "Biological Weight",
            "Sugar",
            "Relative Water",
            "Chlorophyll A",
            "Chlorophyll B",
            "Protein %",
            "Leaf Area Index"
    };

    public VisualisationPanel(double[] stats) {
        this.stats = stats;
        setBackground(Color.BLACK);
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Most Successful Plant Phenotype:", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setForeground(Color.WHITE);
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));
        add(title, BorderLayout.NORTH);

        JPanel graphPanel = new JPanel();
        graphPanel.setLayout(new BoxLayout(graphPanel, BoxLayout.X_AXIS));
        graphPanel.setBackground(Color.BLACK);
        graphPanel.setBorder(BorderFactory.createEmptyBorder(10, 30, 30, 30));

        // Predefined maximums for specific stats
        double[] fixedMaximums = new double[stats.length];
        for (int i = 0; i < stats.length; i++) {
            switch (labels[i]) {
                case "Sugar":
                case "Relative Water":
                    fixedMaximums[i] = 1.0; // 100%
                    break;
                case "Chlorophyll A":
                case "Chlorophyll B":
                    fixedMaximums[i] = 5.0; // to show low numbers clearly
                    break;
                default:
                    fixedMaximums[i] = stats[i]; // will be replaced with actual max later
                    break;
            }
        }

        // Determine max among the rest
        double generalMax = getMax(stats);
        for (int i = 0; i < stats.length; i++) {
            if (fixedMaximums[i] == stats[i]) {
                fixedMaximums[i] = generalMax;
            }
        }

        // Create bars
        for (int i = 0; i < stats.length; i++) {
            graphPanel.add(createVerticalBar(labels[i], stats[i], fixedMaximums[i]));
            graphPanel.add(Box.createRigidArea(new Dimension(15, 0)));
        }

        add(graphPanel, BorderLayout.CENTER);
    }

    private JPanel createVerticalBar(String label, double value, double max) {
        final int fixedBarWidth = 50;
        final int maxBarHeight = 200;

        JPanel barPanel = new JPanel();
        barPanel.setLayout(new BoxLayout(barPanel, BoxLayout.Y_AXIS));
        barPanel.setBackground(Color.BLACK);
        barPanel.setAlignmentY(Component.BOTTOM_ALIGNMENT);

        JLabel valueLabel = new JLabel(String.format("%.2f", value));
        valueLabel.setForeground(Color.WHITE);
        valueLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        valueLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        barPanel.add(valueLabel);

        barPanel.add(Box.createVerticalStrut(5));

        int barHeight = (int) ((value / max) * maxBarHeight);

        JPanel bar = new JPanel();
        bar.setPreferredSize(new Dimension(fixedBarWidth, barHeight));
        bar.setMaximumSize(new Dimension(fixedBarWidth, barHeight));
        bar.setMinimumSize(new Dimension(fixedBarWidth, barHeight));
        bar.setBackground(new Color(135, 206, 250));
        bar.setAlignmentX(Component.CENTER_ALIGNMENT);

        // wrapper to align bars at the bottom
        JPanel barWrapper = new JPanel();
        barWrapper.setLayout(new BoxLayout(barWrapper, BoxLayout.Y_AXIS));
        barWrapper.setBackground(Color.BLACK);
        barWrapper.setPreferredSize(new Dimension(fixedBarWidth, maxBarHeight));
        barWrapper.setMaximumSize(new Dimension(fixedBarWidth, maxBarHeight));
        barWrapper.setMinimumSize(new Dimension(fixedBarWidth, maxBarHeight));
        barWrapper.add(Box.createVerticalGlue());
        barWrapper.add(bar);
        barWrapper.setAlignmentX(Component.CENTER_ALIGNMENT);
        barPanel.add(barWrapper);

        barPanel.add(Box.createVerticalStrut(5));

        JLabel nameLabel = new JLabel("<html><center>" + label + "</center></html>", SwingConstants.CENTER);
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        barPanel.add(nameLabel);

        return barPanel;
    }

    private double getMax(double[] data) {
        double max = Double.MIN_VALUE;
        for (double d : data) {
            if (d > max) max = d;
        }
        return max;
    }
}
