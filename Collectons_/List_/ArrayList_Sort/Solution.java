package Collectons_.List_.ArrayList_Sort;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Student> lst=new ArrayList<>();
        lst.add(new Student("B",21));
        lst.add(new Student("C",20));
        lst.add(new Student("A",18));
        Collections.sort(lst,new SortStudentByName());
        for(Student s:lst){
            System.out.println(s);
        }
    }
}
