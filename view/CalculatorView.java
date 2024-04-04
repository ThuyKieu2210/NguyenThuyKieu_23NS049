package view;

import javax.swing.*;
import java.awt.*;
import control.CalculatorListener;
import model.CalculatorModel;

public class CalculatorView extends JFrame {

    private CalculatorModel calculatorModel;
    private JTextField displayField;
    private JButton numberButtons[];
    private JPanel buttonPanel;
    private JButton addButton, subtractButton, multiplyButton, divideButton, equalButton;
    private JTextField resultField;

    public CalculatorView() throws HeadlessException {
        super("Calculator MVC");
        this.calculatorModel = new CalculatorModel();
        initializeView();
    }

    private void initializeView() {
        this.setSize(350, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        // Display field
        displayField = new JTextField(10);
        displayField.setEditable(false);

        // Number buttons
        numberButtons = new JButton[10];
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 3));
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(new CalculatorListener(this));
            buttonPanel.add(numberButtons[i]);
        }

        // Operations buttons
        addButton = new JButton("+");
        addButton.addActionListener(new CalculatorListener(this));
        subtractButton = new JButton("-");
        subtractButton.addActionListener(new CalculatorListener(this));
        multiplyButton = new JButton("*");
        multiplyButton.addActionListener(new CalculatorListener(this));
        divideButton = new JButton("/");
        divideButton.addActionListener(new CalculatorListener(this));
        equalButton = new JButton("=");
        equalButton.addActionListener(new CalculatorListener(this));

        // Result field
        resultField = new JTextField(10);
        resultField.setEditable(false);

        // Set layout and add components
        this.setLayout(new BorderLayout());
        this.add(displayField, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.CENTER);

        JPanel operationPanel = new JPanel(new GridLayout(5, 1));
        operationPanel.add(addButton);
        operationPanel.add(subtractButton);
        operationPanel.add(multiplyButton);
        operationPanel.add(divideButton);
        operationPanel.add(equalButton);

        this.add(operationPanel, BorderLayout.EAST);
        this.add(resultField, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public JTextField getDisplayField() {
        return displayField;
    }

    public JTextField getResultField() {
        return resultField;
    }

    public CalculatorModel getCalculatorModel() {
        return calculatorModel;
    }
}
