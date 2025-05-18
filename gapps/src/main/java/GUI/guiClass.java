package GUI;

import javax.swing.*;
import java.awt.*;

public class guiClass extends JPanel {
    private JTextField populationInput;
    private JTextField generationInput;
    private JButton goButton;

    public guiClass() {
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);

        // Header
        JLabel heading = new JLabel("GAPPS", SwingConstants.CENTER);
        heading.setFont(new Font("SansSerif", Font.BOLD, 48));
        heading.setForeground(Color.WHITE);
        heading.setBorder(BorderFactory.createEmptyBorder(40, 0, 20, 0));
        add(heading, BorderLayout.NORTH);

        // Center form panel
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridBagLayout());
        formPanel.setBackground(Color.BLACK);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel populationLabel = new JLabel("Population Size:");
        populationLabel.setForeground(Color.WHITE);
        populationInput = new JTextField(10);
        populationInput.setBackground(Color.DARK_GRAY);
        populationInput.setForeground(Color.WHITE);
        populationInput.setCaretColor(Color.WHITE);

        JLabel generationLabel = new JLabel("Generation Cycles Per Year:");
        generationLabel.setForeground(Color.WHITE);
        generationInput = new JTextField(10);
        generationInput.setBackground(Color.DARK_GRAY);
        generationInput.setForeground(Color.WHITE);
        generationInput.setCaretColor(Color.WHITE);

        goButton = new JButton("Go");
        goButton.setBackground(Color.DARK_GRAY);
        goButton.setForeground(Color.BLACK);

        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(populationLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(populationInput, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(generationLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(generationInput, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        formPanel.add(goButton, gbc);

        add(formPanel, BorderLayout.CENTER);
    }

    public JButton getGoButton() {
        return goButton;
    }

    public int getPopulationSize() {
        return Integer.parseInt(populationInput.getText());
    }

    public int getGenerationCyclesPerYear() {
        return Integer.parseInt(generationInput.getText());
    }
}
