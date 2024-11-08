package main.java.org.lld.Step_19_NullObjectPattern;

public class VehicleFactory {

    static Vehicle getVehicleObject(String typeOfVehicle){
        if("Car".equals(typeOfVehicle)) {
            return new Car();
        }
        return new NullVehicle();
    }
}
