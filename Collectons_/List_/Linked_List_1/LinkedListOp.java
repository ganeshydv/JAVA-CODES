package Collectons_.List_.Linked_List_1;

import java.util.LinkedList;

public class LinkedListOp {
    public static void main(String[] args) {
        LinkedList llst=new LinkedList();
        llst.add(123);   //at end
        llst.push("hello"); //at front
        llst.push(321);
        System.out.println("--"+llst.peek());    //head retrieve
        System.out.println("--"+llst.remove());  //head retrieve + remove
        System.out.println("--"+llst.poll());   ////head retrieve + remove
        for (Object o:llst) {
            System.out.println(o);
        }

    }
}
