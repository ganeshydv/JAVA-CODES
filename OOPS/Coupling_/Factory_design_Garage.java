package Coupling_;


//for returning object................FACTORY DESIGN .....................


public class Factory_design_Garage {
    static Vehicle getVehicle(int a){
        if(a==1){
            return new Bicycle();
        }else if(a==2) {
            return new Car();
        }else
        {
            System.out.println("invalid vehicle type");
        }
        return null;
    }
}
