package InnerClass.StaticCls;

public class InnerStaticClassEx1 {


    static class StaticInnerClass{
        {
            System.out.println("Static inner class StaticInnerClass access...");
        }
        static int a=10;
        int b=10;
        void disp(){
            System.out.println("inside disp()");
        }
        static void show(){
            System.out.println("inside static show()");
        }
    }
}
