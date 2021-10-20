package Calculator;

import javax.swing.*;
import java.awt.*;


public class Main {

    public JFrame window;

    public Main(){
        window = new JFrame("Calculator'/Calculator");
        window.setSize(280, 367);//размер панели
        window.add(new Panel());
        window.setLocationRelativeTo(null);//размещение панели на экране
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("File");
        Menu menu1 = new Menu("Info");
        MenuItem OpenFile = new MenuItem("Open");
        MenuItem SaveFile = new MenuItem("Save");
        MenuItem SaveAs = new MenuItem
                ("Save as");
        menu.add(OpenFile);
        menu.add(SaveFile);
        menu.add(SaveAs);
        menuBar.add(menu);
        window.setMenuBar(menuBar);
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
