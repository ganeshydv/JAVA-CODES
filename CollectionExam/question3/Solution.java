package com.question3;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        LinkedHashMap<String,Car> lmap=new LinkedHashMap<>();
        lmap.put("BMW",new Car(225377.2,"WHITE"));
        lmap.put("Mustang",new Car(673523.2,"Blue"));
        lmap.put("Lamborghini",new Car(76363.2,"Black"));
        Set<String> keys=lmap.keySet();
        ArrayList<Car> lst=new ArrayList<>();
        TreeSet<Car>  ts=new TreeSet<>(new SortByColor());
        for(String s:keys){
            System.out.println(s+" "+lmap.get(s));
            lst.add(lmap.get(s));
            ts.add(lmap.get(s));
        }
        //sort using arrayList
        Collections.sort(lst,new SortByColor());
        for( Car c:lst){
            System.out.println(c);
        }

        //sort using HastSet







    }
}
