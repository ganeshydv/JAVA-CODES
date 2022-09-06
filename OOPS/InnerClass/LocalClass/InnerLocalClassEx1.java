package InnerClass.LocalClass;

public class InnerLocalClassEx1 {
    void disp(){
        class InnerCls{
            int a=10;
            void show(){
                System.out.println("inside inner class a="+a);
            }
        }
        InnerCls ref=new InnerCls();
        ref.show();
        System.out.println("inside disp() a="+ref.a);
    }
}
