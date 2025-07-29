package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColorPicker {
    JFrame frame = new JFrame();
    JComboBox<Color> comboBox = new JComboBox<>();

    public void runApp() {
        comboBox.setBounds(40, 40, 230, 40);
        comboBox.addItem(new Color(0x4A5A7C));
        comboBox.addItem(new Color(0xFF0000));
        comboBox.addItem(new Color(0xCD29C8));
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                frame.getContentPane().setBackground(comboBox.getItemAt(comboBox.getSelectedIndex()));
            }
        });

        frame.add(comboBox);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
