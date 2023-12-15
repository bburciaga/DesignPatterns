package utils;

import utils.calculate.Addition;
import utils.calculate.Division;
import utils.calculate.Multiplication;
import utils.calculate.Subtraction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    /** Numbered buttons **/
    private JButton btn_0;
    private JButton btn_1;
    private JButton btn_2;
    private JButton btn_3;
    private JButton btn_4;
    private JButton btn_5;
    private JButton btn_6;
    private JButton btn_7;
    private JButton btn_8;
    private JButton btn_9;
    /** Operation buttons **/
    private JButton btn_divide;
    private JButton btn_multiply;
    private JButton btn_add;
    private JButton btn_subtract;
    private JButton btn_equals;
    private JButton btn_ac;
    /** Other **/
    public JPanel CalculatorPanel;
    private JTextField text_display;
    /** Variables **/
    Double x;
    char operation = ' ';

    public Calculator() {
        btn_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text_display.setText(text_display.getText() + btn_7.getText());
            }
        });
        btn_ac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = null;
                operation = ' ';
                text_display.setText(null);
            }
        });
        btn_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text_display.setText(text_display.getText() + btn_8.getText());
            }
        });
        btn_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text_display.setText(text_display.getText() + btn_9.getText());
            }
        });
        btn_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text_display.setText(text_display.getText() + btn_4.getText());
            }
        });
        btn_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text_display.setText(text_display.getText() + btn_5.getText());
            }
        });
        btn_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text_display.setText(text_display.getText() + btn_6.getText());
            }
        });
        btn_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text_display.setText(text_display.getText() + btn_1.getText());
            }
        });
        btn_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text_display.setText(text_display.getText() + btn_2.getText());
            }
        });
        btn_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text_display.setText(text_display.getText() + btn_3.getText());
            }
        });
        btn_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text_display.setText(text_display.getText() + btn_0.getText());
            }
        });
        btn_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double temp = Double.parseDouble(text_display.getText());
                checkOperation('+', temp);
            }
        });
        btn_subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double temp = Double.parseDouble(text_display.getText());
                checkOperation('-', temp);
            }
        });
        btn_divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double temp = Double.parseDouble(text_display.getText());
                checkOperation('/', temp);
            }
        });
        btn_multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double temp = Double.parseDouble(text_display.getText());
                checkOperation('*', temp);
            }
        });
        btn_equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double temp = Double.parseDouble(text_display.getText());
                equalOperation(temp);
            }
        });
    }

    private void checkOperation (char operation, Double val) {
        switch (this.operation) {
            case '+':
                if (null != x) {
                    x = new Addition().execute(x, val);
                    this.operation = operation;
                    text_display.setText(null);
                }
                break;
            case '-':
                if (null != x) {
                    x = new Subtraction().execute(x, val);
                    this.operation = operation;
                    text_display.setText(null);
                }
                break;
            case '/':
                if (null != x) {
                    x = new Division().execute(x, val);
                    this.operation = operation;
                    text_display.setText(null);
                }
                break;
            case '*':
                if (null != x) {
                    x = new Multiplication().execute(x, val);
                    this.operation = operation;
                    text_display.setText(null);
                }
                break;
            default:
                x = val;
                this.operation = operation;
                text_display.setText(null);
        }
    }

    private void equalOperation (Double val) {
        switch (operation) {
            case '+':
                text_display.setText(new Addition().execute(x, val).toString());
                break;
            case '-':
                text_display.setText(new Subtraction().execute(x, val).toString());
                break;
            case '/':
                text_display.setText(new Division().execute(x, val).toString());
                break;
            case '*':
                text_display.setText(new Multiplication().execute(x, val).toString());
                break;
        }
        operation = ' ';
    }
}