package main.java.org.lld.Step_08_Factory_vs_AbstractFactory_Patterns.AbstractFactory;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}
