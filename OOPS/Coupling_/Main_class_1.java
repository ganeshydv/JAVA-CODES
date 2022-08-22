package Coupling_;

import java.util.Scanner;

public class Main_class_1 {
    public static void main(String[] args) {
        Person p1=new Person();
        Scanner sc=new Scanner(System.in);
        System.out.println("press 1) Bicycle /t 2)Car");
        int a=sc.nextInt();
        p1.decideVehicle(Factory_design_Garage.getVehicle(a));  //to decide and pass particular object
        p1.travel();
    }
}
