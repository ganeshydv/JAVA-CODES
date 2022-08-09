package polymorphism;

public class Demo1 {
    void disp(){
        System.out.println("disp() in Demo1");
    }
}
class A extends Demo1{

    @Override
    void disp(){
        System.out.println("disp() in A");
    }
}
class B extends Demo1{
    @Override
    void disp(){
        System.out.println("disp() in B");
    }
}

class Mainclass{
    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        Demo1 d2=new A();
        Demo1 d3=new B();
        casting_method(d1);
        casting_method(d2);
        casting_method(d3);

    }
    static void casting_method(Demo1 d1){
        d1.disp();
    }
    static  A cerate_object_of_a(){
        return new A();
    }
}