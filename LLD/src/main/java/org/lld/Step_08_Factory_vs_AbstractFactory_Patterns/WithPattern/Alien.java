package main.java.org.lld.Step_08_Factory_vs_AbstractFactory_Patterns.WithPattern;

public class Alien implements Enemy {

    @Override
    public void display() {
        System.out.println("Alien approaches menacingly!");
    }

    @Override
    public void attack() {
        System.out.println("Alien fires a plasma beam at the target!");
    }

    @Override
    public void move() {
        System.out.println("Alien moves swiftly with advanced technology!");
    }

}
