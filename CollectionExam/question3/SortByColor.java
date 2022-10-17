package com.question3;

import java.util.Comparator;

public class SortByColor implements Comparator<Car> {
    @Override
    public int compare(Car c1,Car c2){
        return c1.getColor().compareTo(c2.getColor());
    }

}
