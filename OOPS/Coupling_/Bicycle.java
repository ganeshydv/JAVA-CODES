package Coupling_;

public class Bicycle implements Vehicle{
    @Override
    public void start(){
        System.out.println("starting bicycle");
    }
    @Override
    public void stop(){
        System.out.println("stop bicycle");
    }
    @Override
    public void move(){
        System.out.println("moving bicycle");
    }
}
