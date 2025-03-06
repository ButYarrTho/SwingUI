import javax.swing.*;
import java.awt.*;

public class SwingUIExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing UI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // panel for buttons 2x2 grid
        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10)); // 10-pixel gaps between buttons

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);

        // text field to display which button was pressed
        JTextField statusField = new JTextField("Last button pressed: None");
        statusField.setEditable(false);
        statusField.setPreferredSize(new Dimension(400, 40));

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adds space around the text field
        bottomPanel.add(statusField, BorderLayout.CENTER);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Outer padding for the main panel
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        frame.getContentPane().add(mainPanel);

        frame.setVisible(true);
    }
}
