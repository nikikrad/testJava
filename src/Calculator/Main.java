package Calculator;

import javax.swing.*;
import java.awt.*;


public class Main {

    public JFrame window;

    public Main(){
        window = new JFrame("Calculator");
        window.setSize(760, 800);//размер панели
        window.add(new Panel());
        window.setLocationRelativeTo(null);//размещение панели на экране
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenu menu1 = new JMenu("Info");
        JMenuItem OpenFile = new JMenuItem("Open", new ImageIcon("images/open.png"));
        JMenuItem SaveFile = new JMenuItem("Save", new ImageIcon("images/save.png"));
        JMenuItem SaveAs = new JMenuItem("Save as", new ImageIcon("images/saveas.png"));
        menu.add(OpenFile);
        menu.addSeparator();
        menu.add(SaveFile);
        menu.addSeparator();
        menu.add(SaveAs);
        menuBar.add(menu);
        window.setJMenuBar(menuBar);
    }

    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable() {//команда для начала работы нашей панели
            @Override
            public void run() {
                new Main();
            }
        });

    }
}
