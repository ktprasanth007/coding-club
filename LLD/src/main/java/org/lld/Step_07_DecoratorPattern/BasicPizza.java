package main.java.org.lld.Step_07_DecoratorPattern;

public class BasicPizza implements main.java.org.lld.Step_07_DecoratorPattern.Pizza {
    @Override
    public String getDescription() {
        return "Basic Pizza";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}
