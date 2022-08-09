package Inheritance_;

public class Main_class {
    static int a=10;
//    static int b=20;
    public static void main(String[] args) {
//        Static_members_access ref1=new Static_members_access();
//        System.out.println(Static_members_access.a);
        B1 ref2=new B1();
        System.out.println(ref2.a);
//        System.out.println(this.a);  //ERROE: this keyword can not be used in static block
        ref2.disp();
        B1.show();
//        ref2.show(2);
        System.out.println(new Main_class().a);
//        System.out.println(b);
    }
}
