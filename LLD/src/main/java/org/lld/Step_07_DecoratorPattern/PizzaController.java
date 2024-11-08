package main.java.org.lld.Step_07_DecoratorPattern;

import main.java.org.lld.Step_07_DecoratorPattern.Decorators.ExtraCheese;
import main.java.org.lld.Step_07_DecoratorPattern.Decorators.TomatoSauce;

public class PizzaController {
    public static void main(String[] args) {
        // Create a basic pizza
        Pizza basicPizza = new BasicPizza();

        // Add cheese topping
        Pizza cheesePizza = new ExtraCheese(basicPizza);

        // Add tomato sauce topping to the cheese pizza
        Pizza deluxePizza = new TomatoSauce(cheesePizza);

        // Get the description and cost of the deluxe pizza
        System.out.println("Deluxe Pizza: " + deluxePizza.getDescription());
        System.out.println("Cost: $" + deluxePizza.getCost());
    }
}
