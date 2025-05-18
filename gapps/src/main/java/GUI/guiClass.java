package GUI;

import javax.swing.*;
import java.awt.*;

public class guiClass extends JPanel {
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JLabel gifLabel;

    public guiClass(String gifPath) {
        setLayout(new BorderLayout());

        // Buttons panel
        JPanel buttonPanel = new JPanel();
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        buttonPanel.add(btn1);
        buttonPanel.add(btn2);
        buttonPanel.add(btn3);

        // GIF panel
        JPanel gifPanel = new JPanel();
        gifPanel.setBackground(Color.BLACK);
        ImageIcon gifIcon = new ImageIcon(gifPath);
        gifLabel = new JLabel(gifIcon);
        gifPanel.add(gifLabel);

        add(buttonPanel, BorderLayout.NORTH);
        add(gifPanel, BorderLayout.CENTER);
    }

    public JButton getBtn1() { return btn1; }
    public JButton getBtn2() { return btn2; }
    public JButton getBtn3() { return btn3; }
}
