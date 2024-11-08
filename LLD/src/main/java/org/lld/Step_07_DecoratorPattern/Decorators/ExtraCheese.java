package main.java.org.lld.Step_07_DecoratorPattern.Decorators;

import main.java.org.lld.Step_07_DecoratorPattern.Pizza;

public class ExtraCheese implements Pizza {
    private Pizza pizza;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.0;
    }
}
