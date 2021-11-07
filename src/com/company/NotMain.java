package com.company;

import java.util.Scanner;
import java.lang.*;

public class NotMain {
    int Health = 100;
    String buf;
    static String Name = "Default";
    static Scanner write = new Scanner(System.in);
    public static void money(){
        Scanner write = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = write.nextLine();

    }

    public NotMain (int d, String n){
        Health = Health - d;
        if(Health < 0) Health = 0;
        Name = n;
    }
    public NotMain (){
        System.out.print("Хотите изменить имя студента(да, нет): ");
        //write.nextLine();
        buf = write.nextLine();
        if(buf == "да"){
            System.out.print("Введите имя студента: ");

            Name = write.nextLine();
        }
    }

}
