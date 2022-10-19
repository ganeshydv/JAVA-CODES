package Collectons_.Map;

public class Car {
    String name;
    Double cost;
    Car(String name,double cost){
        this.name=name;
        this.cost=cost;
    }
    public String toString(){
        return "Car: "+name+" cost: "+cost;
    }

}
