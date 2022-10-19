package Collectons_.SET.LinkedHashSet_;

import java.util.LinkedHashSet;

public class Linked_HsahSet_op {
    public static void main(String[] args) {
        LinkedHashSet lsh=new LinkedHashSet();
        lsh.add(123);
        lsh.add(3.14);
        lsh.add("hello");
        for (Object obj:lsh){
            System.out.println(lsh);   //toSting() overridden
        }
    }
}
