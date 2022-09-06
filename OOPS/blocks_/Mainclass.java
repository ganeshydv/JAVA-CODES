package blocks_;

public class Mainclass {
    public static void main(String[] args) {
        System.out.println("in main() ...static  a="+Block_init_var.a);
        Block_init_var ref=new Block_init_var();
        System.out.println("in main()  non static b="+ref.b);

    }
}
