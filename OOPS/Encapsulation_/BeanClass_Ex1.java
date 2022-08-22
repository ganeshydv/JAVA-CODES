package Encapsulation_;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BeanClass_Ex1 {
    private String name;
    private int age;
    BeanClass_Ex1(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
class MainClass{
    public static void main(String[] args) {
        BeanClass_Ex1 ref=new BeanClass_Ex1("tony",34);
        System.out.println("name:"+ref.getName()+" age: "+ref.getAge());
        System.out.println("want to change data: 1)yes \t 2)NO");
        int a=select();
        if(a==-1) System.out.println("not changing data...");
        else {
            System.out.println("to change name enter 1...\n to change age enter 2 \n to change both enter 3");
            Scanner sc=new Scanner(System.in);
            int b= sc.nextInt();
            if(b==1){
                System.out.println("enter new name : ");
                String s=sc.next();
                System.out.println("changing name to: "+s);
                ref.setName(s);
            } else if (b==2) {
                System.out.println("enter new age : ");
                int s=sc.nextInt();
                System.out.println("changing age to: "+s);
                ref.setAge(s);
            } else if (b==3) {
                System.out.println("enter new name : ");
                String s=sc.next();
                System.out.println("changing name to: "+s);
                ref.setName(s);
                //----------------age-----------
                System.out.println("enter new age : ");
                int s1=sc.nextInt();
                System.out.println("changing age to: "+s1);
                ref.setAge(s1);
            }
            System.out.println("end...........");;
        }
    }
    static int select(){

        Scanner sc=new Scanner(System.in);
        int a=-1;
        try {
            a= sc.nextInt();
            if(a==2 || a==0) return -1;
            if(a>2){
                System.out.println("enter input 1 or 2");
                select();
            }
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
            System.out.println("Enter 1 or 2 ....Enter 0 if don't want to change data ");
            select();
        }
        return a;
    }
}