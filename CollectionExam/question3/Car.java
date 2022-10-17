package com.question3;

public class Car {
    private Double cost;
    private String color;
    Car(Double cost,String color){
        this.cost=cost;
        this.color=color;
    }
    public Double getCoast(){
        return cost;
    }
    public String getColor(){
        return color;
    }
    @Override
    public String toString(){
        return "color: "+color+" cost: "+cost;
    }
}
