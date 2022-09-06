package com.part1.question5;

public interface Vechile {
    void start();
    void stop();
    void run();
}
class Car implements Vechile{
    public void start(){
        System.out.println("car is starting...");

    }
    public void run(){
        System.out.println("car is running...");

    }
    public void stop(){
        System.out.println("car stopped...");

    }
}
class Bicycle implements Vechile{
    public void start(){
        System.out.println("Bicycle paddleing is  starting...");

    }
    public void run(){
        System.out.println("bicycle is running...");

    }
    public void stop(){
        System.out.println("bicycle stopped...");

    }
}

