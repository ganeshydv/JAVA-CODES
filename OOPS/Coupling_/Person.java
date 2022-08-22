package Coupling_;

public class Person {
    Vehicle v1;        //for polymorphism
//    Vehicle v1=new Car();   //abstraction
    void decideVehicle(Vehicle v1){
        this.v1=v1;
    }

    void travel(){
        if(v1!=null){
            v1.start();
            v1.move();
            v1.stop();
        }else{
            System.out.println("first decide vehicle");
        }

    }

}
