package abstraction_1.abstractionEx1;

public interface Vehicle {
    void start();
    void run();
    void stop();
}

class Car implements Vehicle{
    public void start(){
        System.out.println("car starting...");
    }
    public void run(){
        System.out.println("car running...");
    }
    public void stop(){
        System.out.println("car stopped...");
    }
}
class Bicycle implements Vehicle{
    public void start(){
        System.out.println("bicycle paddling  ..");
    }
    public void run(){
        System.out.println("bicycle running ..");
    }
    public void stop(){
        System.out.println("bicycle paddling stopped ..");
    }
}
