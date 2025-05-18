package GUI;

import javax.swing.*;
import java.awt.*;

public class ResultsPanel extends JPanel {
    private JTextArea outputArea;
    private ImageIcon backgroundGif;

    public ResultsPanel(String gifPath) {
        setLayout(new BorderLayout());

        backgroundGif = new ImageIcon(gifPath);
        JLabel backgroundLabel = new JLabel(backgroundGif);
        backgroundLabel.setLayout(new BorderLayout());
        setBackground(Color.BLACK);
        outputArea = new JTextArea();
        outputArea.setOpaque(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        outputArea.setForeground(Color.WHITE);
        outputArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());

        backgroundLabel.add(scrollPane, BorderLayout.CENTER);
        add(backgroundLabel);
    }

    public void appendText(String text) {
        SwingUtilities.invokeLater(() -> {
            outputArea.append(text + "\n");
            outputArea.setCaretPosition(outputArea.getDocument().getLength());
        });
    }
}
