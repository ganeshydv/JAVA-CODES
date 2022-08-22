package Coupling_;

public class Car implements Vehicle{
    public void start(){
        System.out.println("starting car");
    }
    public void stop(){
        System.out.println("stop car");
    }
    public void move(){
        System.out.println("moving bicycle");
    }
}
