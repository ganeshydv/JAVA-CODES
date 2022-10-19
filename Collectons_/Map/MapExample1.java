package Collectons_.Map;

import java.util.*;

public class MapExample1 {
    public static void main(String[] args) {
        Map<Integer,Car> mp=new HashMap<>();
        mp.put(1,new Car("oddi",2.34));
        mp.put(2,new Car("lamoborgini",4.32));
        mp.put(3,new Car("ferrari",3.34));
        Set<Integer> keys=mp.keySet();
        for(Integer i:keys){
            System.out.println(mp.get(i));
        }
    }
}
