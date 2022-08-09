package abstraction_1;

public interface A {
    void disp();
}

class B implements A{
    @Override
    public void disp(){
        System.out.println("disp() overridden in implementing class B");
    }
}
class Mainclass1{
    A ref_of_impl=new B();  // HAS A relationship //copy per object   //NON-STATIC or INSTANCE
    static A ref_var=new B();  //HAS A relation  //only one copy for all objects //STATIC
    public static void main(String[] args) {
        A i_ref=new B();
//        i_ref.disp();
//        Mainclass1 obj=new Mainclass1();
//        obj.ref_of_impl.disp(); //NON-STATIC or INSTANCE access
//        ref_var.disp();  // STATIC access
        catsing_method(i_ref);
    }
    static void catsing_method(A a1){
        a1.disp();
    }
}