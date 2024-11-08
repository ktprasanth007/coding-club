package main.java.org.lld.Step_32_All_Creational_Patterns.Abstract_Factory_Pattern;

public class EconomicFactory implements AbstractFactory {

    @Override
    public Car getCarInstance(int price) {
        if (price<1000000) return new EconomicCar1();
        else return new EconomicCar2();
    }

}
