package Interface_;

public interface Interface_implementation1 {
    void disp();
//    void  disp(int a);

}
class A implements Interface_implementation1{
    public void disp(){
        System.out.println("disp() in A");
    }
    public void disp(int a){
//        return 1;
    }
}
class B implements Interface_implementation1{
    public void disp(){
        System.out.println("disp() in B");
    }
}
class Mainclass1{
    public static void main(String[] args) {
        Interface_implementation1 ref1=new A();
        Interface_implementation1 ref2=new B();
        ref1.disp();
        ref2.disp();
    }
}