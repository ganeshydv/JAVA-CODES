package Collectons_.SET.HashSet_;

import java.util.HashSet;

public class Hash_set_operations {
    public static void main(String[] args) {
        HashSet set=new HashSet();
        set.add(123);
        set.add(3.12);
        set.add("hello");
        for(Object obj:set){
            System.out.println(obj);
        }
//        set.remove();  //will not work
//        set.removeAll()

    }
}
