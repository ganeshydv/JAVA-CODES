package Inheritance_;

public class Static_members_access {
    static int a=10;
    static void show(){
        System.out.println("show ");
    }
}
class B1 extends Static_members_access{
//    static int a=20;

//    static void show(int a){
//        System.out.println(" show overloaded");
//    }
    void disp(){
        System.out.println(" a :"+super.a);
    }
}
