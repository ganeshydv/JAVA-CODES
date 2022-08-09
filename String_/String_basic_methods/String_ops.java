package String_basic_methods;

import java.util.Arrays;

public class String_ops {
    public static void main(String[] args) {
        String s="hellooooooooooo eeeeeee";

        System.out.println("startWith: "+s.startsWith("he"));
        System.out.println("charAt: "+s.charAt(3));
        System.out.println("endsWith: "+s.endsWith("lo"));
        System.out.println("equals: "+s.equals("hi"));
        System.out.println("length :"+s.length());
        String[] s_arr=s.split(" ");
        System.out.println("split: "+ Arrays.toString(s_arr));
        String[] s_arr2=s.split("e",2);
        System.out.println("split: "+Arrays.toString(s_arr2));
    }
}
