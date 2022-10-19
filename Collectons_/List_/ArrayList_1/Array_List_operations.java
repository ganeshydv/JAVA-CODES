package Collectons_.List_.ArrayList_1;

import java.util.ArrayList;

public class Array_List_operations {
    public static void main(String[] args) {
        ArrayList lst=new ArrayList();
        lst.add(123);                  //this is -->new Integer(123) because collection does not support primitive
        lst.add(Integer.valueOf(23)); //this is -->new Integer(23) because collection does not support primitive
        lst.add("java");                //this is -->new String(23) because collection does not support primitive
        lst.add('G');                   //this is -->new Character(23) because collection does not support primitive
        lst.add(7.7);                   //this is -->new Double(23) because collection does not support primitive

        for(Object inst:lst){
            System.out.print(inst+" ");  //  toSting() is OVERRIDDEN in every WRAPPER class
        }
        System.out.println();
        lst.set(2,4.3);
        System.out.println("removing element at index 1"+lst.remove(1));
        System.out.println("element at 3rd index:"+lst.get(3));
        for(Object inst:lst){
            System.out.print(inst+" ");  //  toSting() is OVERRIDDEN in every WRAPPER class
        }
        for(int i=0;i<lst.size();i++){
            System.out.println(lst.get(i));
        }
    }
}
