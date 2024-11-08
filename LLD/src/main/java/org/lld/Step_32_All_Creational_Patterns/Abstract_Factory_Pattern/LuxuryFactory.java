package main.java.org.lld.Step_32_All_Creational_Patterns.Abstract_Factory_Pattern;

public class LuxuryFactory implements AbstractFactory {

    @Override
    public Car getCarInstance(int price) {
        if (price<5000000 && price>3000000) return new LuxuryCar1();
        else return new LuxuryCar2();
    }

}
