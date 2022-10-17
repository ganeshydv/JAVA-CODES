package com.question3;

import java.util.Comparator;

public class SortByCost implements Comparator <Car>{
    public int compare(Car c1,Car c2){
        return c1.getCoast().compareTo(c2.getCoast());
    }
}
