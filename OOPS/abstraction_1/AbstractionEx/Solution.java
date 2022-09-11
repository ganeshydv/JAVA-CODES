package abstraction_1.abstractionEx1;

public class Solution {
    public static void main(String[] args) {
        Vehicle v1_bicycle=new Bicycle();
        Vehicle v2_car=new Car();
        runVehicle(v1_bicycle);
        System.out.println("-------------");
        runVehicle(v2_car);

    }
    static void runVehicle(Vehicle v){
        v.start();
        v.run();
        v.stop();
    }
}
