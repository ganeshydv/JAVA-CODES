import java.util.*;

public class Dereferance_obj {
    public static void main(String[] args) {
        Dereferance_obj d1=new Dereferance_obj();
        d1.disp();
    }
    void disp(){

        String s1=new String("hello");
        String s2=s1;
        String s3="hello";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s2.equals(s3));
    }
}
