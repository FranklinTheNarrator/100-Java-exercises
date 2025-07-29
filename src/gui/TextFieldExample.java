package gui;

import javax.swing.*;

public class TextFieldExample {
    JFrame frame = new JFrame();
    JButton button = new JButton("Click Me!");
    JTextField textField = new JTextField();

    public void runApp() {
        button.setBounds(47, 40, 90, 40);
        textField.setBounds(20, 85, 150, 25);

        frame.add(button);
        frame.add(textField);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
