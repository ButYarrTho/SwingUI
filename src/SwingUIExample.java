import javax.swing.*;
import java.awt.*;

public class SwingUIExample {
    public static void main(String[] args) {
        //  main app
        JFrame frame = new JFrame("Swing UI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);

        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);

        // this  is text field
        JTextField statusField = new JTextField("Last button pressed: None", 30);
        statusField.setEditable(false);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(buttonPanel, BorderLayout.NORTH);
        mainPanel.add(statusField, BorderLayout.CENTER);

        frame.getContentPane().add(mainPanel);

        frame.setVisible(true);
    }
}