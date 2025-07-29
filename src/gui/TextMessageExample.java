package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextMessageExample {
    JFrame frame = new JFrame();
    JButton button = new JButton("Click Me!");

    public void runApp() {
        button.setBounds(40, 40, 90, 40);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hi!");
            }
        });

        frame.add(button);
        frame.setSize(200, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
