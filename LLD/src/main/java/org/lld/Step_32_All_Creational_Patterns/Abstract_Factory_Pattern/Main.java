package main.java.org.lld.Step_32_All_Creational_Patterns.Abstract_Factory_Pattern;

public class Main {

    public static void main(String[] args) {
        AbstractFactoryProducer abstractFactoryProducer = new AbstractFactoryProducer();
        AbstractFactory economicFactory = abstractFactoryProducer.getFactoryInstance("Economic");
        Car economicCar = economicFactory.getCarInstance(1100000);
        System.out.println(economicCar.getTopSpeed());
    }
}
