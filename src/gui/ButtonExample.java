package gui;

import javax.swing.*;

public class ButtonExample {
    JFrame frame = new JFrame();
    JButton button = new JButton("Click Me!");

    public void runApp() {
        button.setBounds(40, 40, 90, 40);

        frame.add(button);
        frame.setSize(200, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
