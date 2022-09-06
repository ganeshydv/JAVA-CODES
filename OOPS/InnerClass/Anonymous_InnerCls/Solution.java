package InnerClass.Anonymous_InnerCls;

public class Solution {
    public static void main(String[] args) {
        Anonymous_InnerCls ref =new Anonymous_InnerCls() {
            @Override
            public void disp() {
                System.out.println("implementing disp() in anonymous inner class ");
            }
        };
        ref.disp();
    }
}
