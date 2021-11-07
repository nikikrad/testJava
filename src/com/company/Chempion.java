package com.company;

public class Chempion extends NotMain {

    public static String skill = "hook";

    public Chempion(int height, String name, String skill){
        //NotMain.Name = "NoDefault";
        super(height, name);
        Chempion.skill = skill;
        }

    public Chempion(){

        }
}
