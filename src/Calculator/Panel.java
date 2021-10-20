package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Menu.*;


public class Panel extends JPanel {

    private JButton buttons[] = new JButton[10];
    private Font font = new Font("SanSerif",Font.BOLD,20);
    private JTextField output = new JTextField();
    private JButton backspace = new JButton("<"), equ = new JButton("=");



    public Panel(){
        setLayout(null);//позволяет размещать элементы как захочется
        setFocusable(true);//
        grabFocus();

        backspace.setBounds(205,10,50,50);
        backspace.setFont(font);
        add(backspace);
        equ.setBounds(10,250,50,50);
        equ.setFont(font);
        add(equ);

        buttons[0] = new JButton("0");
        buttons[0].setBounds(70,250, 50,50);
        buttons[0].setFont(font);
        add(buttons[0]);

        buttons[1] = new JButton(".");
        buttons[1].setBounds(130,250, 50,50);
        buttons[1].setFont(font);
        add(buttons[1]);

        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                buttons[x * 3 + y + 1] = new JButton((x * 3 + y + 1) + "");
                buttons[x * 3 + y + 1].setBounds(x * (50 + 10) + 10, y * (50+10) + 70, 50, 50);
                buttons[x * 3 + y + 1].setFont(font);
                add(buttons[x * 3 + y + 1]);

            }
        }
        output.setBounds(10,10,180,50);
        output.setFont(font);
        output.setEditable(false);
        add(output);

        ActionListener l = (ActionEvent e) -> {//лямбдавыражение(реализуем метод)
            JButton b = (JButton)e.getSource();
            output.setText(output.getText() + b.getText());
        } ;

        for(JButton b : buttons){
            b.addActionListener(l);
        }

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char symbol = e.getKeyChar();

                if(Character.isDigit(symbol))
                    return;

                output.setText(output.getText() + symbol);

            }
        });
    }
}
