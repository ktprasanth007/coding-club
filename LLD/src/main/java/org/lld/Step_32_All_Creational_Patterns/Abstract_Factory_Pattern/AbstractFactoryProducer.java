package main.java.org.lld.Step_32_All_Creational_Patterns.Abstract_Factory_Pattern;

public class AbstractFactoryProducer {

    public AbstractFactory getFactoryInstance(String value) {
        if (value.equals("Economic")) return new EconomicFactory();
        else if (value.equals("Luxury")) return new LuxuryFactory();
        else return null;
    }

}
