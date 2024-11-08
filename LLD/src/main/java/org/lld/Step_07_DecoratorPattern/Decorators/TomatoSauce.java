package main.java.org.lld.Step_07_DecoratorPattern.Decorators;

import main.java.org.lld.Step_07_DecoratorPattern.Pizza;

public class TomatoSauce implements Pizza {

    private Pizza pizza;

    public TomatoSauce(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Tomato Sauce";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.5;
    }

}
