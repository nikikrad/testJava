package Calculator;

import javax.swing.*;
import java.awt.*;

public class Scelet extends JFrame{

    private JButton button = new JButton("Press");
    private JLabel lable = new JLabel("input");
    private JTextField input  = new JTextField("",5);
    private JCheckBox chack = new JCheckBox();

    public Scelet(){
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setSize(350,300);


        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));

        container.add(input);
        container.add(lable);
    }
}
