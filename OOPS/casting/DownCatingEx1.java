package casting;

public class DownCatingEx1 {
    public static void main(String[] args) {
        A upcasted_ref =new B();
        upcasted_ref.disp();

        B downCatsedRef=(B) upcasted_ref;
        downCatsedRef.test();
        downCatsedRef.disp();
    }
}

class A{
    void disp(){
        System.out.println("disp() of Super/Base class A");
    }
}

class B extends A{
    void test(){
        System.out.println("test() of Sub/Derived class A");
    }
}