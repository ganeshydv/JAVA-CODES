package overriding;

public class Overriding_1 {
    int x;
    void test(){
        System.out.println("test() method of superclass");
    }
    int test(int a){
        return 0;
    }
    static void disp(){
        System.out.println("static disp() of superclass");
    }
}

class A extends Overriding_1{
    int x=4;
    @Override
    void test(){
        int x=8;
        System.out.println("test() overridden");
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
    static void disp(){
        System.out.println("static disp() of A");
    }
}

class MainClass{
    public static void main(String[] args) {
       Overriding_1 o1=new A();
        o1.disp();
        o1.test();
    }
}