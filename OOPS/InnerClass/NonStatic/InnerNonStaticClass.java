package InnerClass.NonStatic;

public class InnerNonStaticClass {
    class NonStaticInnerClassEx1{
        static void disp(){
            System.out.println("static disp() access...");
        }
        void show(){
            System.out.println("non static show() access....");
        }
    }
}
