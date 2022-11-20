import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator {
    private JPanel Calculator;
    private JTextField textField1;
    private JButton bDot;
    private JButton bEight;
    private JButton bTwo;
    private JButton bOne ;
    private JButton bZero;
    private JButton bFive;
    private JButton bFour;
    private JButton bSix;
    private JButton bDivision;
    private JButton bPlus;
    private JButton bThree;
    private JButton bNine;
    private JButton bSeven;
    private JButton bSqrt;
    private JButton bMul;
    private JButton bPower;
    private JButton bC;
    private JButton bEqual;
    private JButton bMinus;

    public Calculator() {
        bOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String otext = bOne.getText();
                textField1.setText(otext);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {

    }
}
