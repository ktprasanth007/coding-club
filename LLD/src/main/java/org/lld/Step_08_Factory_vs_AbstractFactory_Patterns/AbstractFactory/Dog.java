package main.java.org.lld.Step_08_Factory_vs_AbstractFactory_Patterns.AbstractFactory;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}
