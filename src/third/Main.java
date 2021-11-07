package third;

import java.util.*;

public class Main {
    public static void main(String []args){

        Scanner enter = new Scanner(System.in);
        class_in_class Car = new class_in_class();
        System.out.println("Do u want to start the car?\nyes or no");
        String choice = enter.nextLine();
        if(choice == "yes"){
            Car.bnw.Start();
            Car.bbk.Start();
        }else{
            Car.bnw.Shutdown();
            Car.bbk.Shutdown();
        }

    }

}
