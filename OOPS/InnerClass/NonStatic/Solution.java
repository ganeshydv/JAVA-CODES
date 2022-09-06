package InnerClass.NonStatic;

public class Solution {
    public static void main(String[] args) {
//        InnerNonStaticClass ref=new InnerNonStaticClass();
//        InnerNonStaticClass.NonStaticInnerClassEx1 ref12=ref.new NonStaticInnerClassEx1();
        //-------------OR--------------------------
        InnerNonStaticClass.NonStaticInnerClassEx1 ref2=new InnerNonStaticClass().new NonStaticInnerClassEx1();
        ref2.show();
        InnerNonStaticClass.NonStaticInnerClassEx1.disp();
    }
}
