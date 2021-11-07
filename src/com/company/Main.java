package com.company;
import java.lang.String;
import java.util.*;
//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        new test();
        second();


        String choice = "";
        Chempion ch = new Chempion();

        System.out.print("Enter Hero name ");
        String Person = name.nextLine();
        System.out.print("Enter damage which " + Person + " is take ");
        int Damage = name.nextInt();
        NotMain Hero = new NotMain(Damage, Person);
        System.out.println("Your hero is " + Hero.Name + " has " + Hero.Health + " health.");
        System.out.print("Enter the that was damage ");
        name.nextLine();
        String skill = name.nextLine();
        Chempion chemp = new Chempion(Damage, Person, skill);
        System.out.println(chemp.Health + " " + chemp.Name + " by " + chemp.skill);

    }
    public static void second(){
        Scanner enter = new Scanner(System.in);
        int k = enter.nextInt();
       //NewClass university = new NewClass();
        switch (k){
            case 1: {
                System.out.print("Enter student name: ");
                String Student;
                enter.nextLine();
                Student = enter.nextLine();
                System.out.print("\nEnter student number years old: ");
                int years = enter.nextInt();
                System.out.print("\nEnter student average score: ");
                int grade = enter.nextInt();
                NewClass university = new NewClass(Student, years, grade);
                break;
            }
            case 2:{
                System.out.print("Enter teacher name: ");
                String teacher;
                teacher = enter.nextLine();
                System.out.print("\nEnter teacher number years old: ");
                int years = enter.nextInt();
                NewClass university = new NewClass(teacher, years);
            }
        }


    }
}
