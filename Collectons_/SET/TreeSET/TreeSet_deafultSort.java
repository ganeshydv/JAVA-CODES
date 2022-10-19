package Collectons_.SET.TreeSET;

import java.util.TreeSet;

public class TreeSet_deafultSort {
    public static void main(String[] args) {
        TreeSet<Car> ts=new TreeSet<>();    //CUSTOM OBJECT BUT DEFAULT SORTING
        ts.add(new Car("A",23.7));
        ts.add(new Car("b",24.4));
        ts.add(new Car("a",20.2));
        for(Car c:ts){
            System.out.println(c);
        }
    }
}
class Car implements Comparable<Car>{
    String car;
    Double cost;
    Car(String car, double cost){
        this.car=car;
        this.cost=cost; //Auto BOXING
    }
    @Override
    public String toString(){
        return "cost of "+car+" is "+cost;
    }
    @Override
    public int compareTo(Car c){
//        return this.cost.compareTo(c.cost);
        return this.car.compareTo(c.car);
    }

}
