import utils.Calculator;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator"); //new instance of the jframe = calculator
        frame.setContentPane(new Calculator().CalculatorPanel); //new instance of calculator and calls calculator gui
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when closed, entire application should close.
        frame.pack(); //resizes frame to make sure all the components fit properly into the frame.
        frame.setVisible(true); //makes jframe visible on screen    }
    }
}