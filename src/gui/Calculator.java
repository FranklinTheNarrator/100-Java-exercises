package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    public JTextField display;
    public double firstNumber = 0;
    public String operation = "";
    public boolean startNewNumber = true;

    public Calculator() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);

        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C", "CE"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.matches("[0-9]")) {
            if (startNewNumber) {
                display.setText("");
                startNewNumber = false;
            }
            display.setText(display.getText() + command);
        } else if (command.equals(".")) {
            if (startNewNumber) {
                display.setText("0");
                startNewNumber = false;
            }
            if (!display.getText().contains(".")) {
                display.setText(display.getText() + ".");
            }
        } else if (command.matches("[+\\-*/]")) {
            if (!operation.isEmpty()) { calculateResult(); }

            firstNumber = Double.parseDouble(display.getText());
            operation = command;
            startNewNumber = true;
        } else if (command.equals("=")) {
            calculateResult();
            operation = "";
        } else if (command.equals("C")) {
            display.setText("0");
            startNewNumber = true;
        } else if (command.equals("CE")) {
            display.setText("0");
            firstNumber = 0;
            operation = "";
            startNewNumber = true;
        }
    }

    private void calculateResult() {
        if (operation.isEmpty()) { return; }

        double secondNumber = Double.parseDouble(display.getText());
        double result = 0;

        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    display.setText("Error");
                    startNewNumber = true;
                    return;
                }
                break;
        }

        if (result == (long) result) {
            display.setText(String.format("%d", (long) result));
        } else {
            display.setText(String.format("%s", result));
        }
        startNewNumber = true;
    }
}
