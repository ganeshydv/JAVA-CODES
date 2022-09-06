package blocks_;

public class Block_init_var {
    static int a=20;
    int b=20;
    static {
        System.out.println("in static block : a="+a);
        a=10;
    }
    {
        System.out.println("in non static block"+b);
        b=30;
    }
}
