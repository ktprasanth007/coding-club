package main.java.org.lld.Step_08_Factory_vs_AbstractFactory_Patterns.WithoutPattern;

public class Zombie implements Enemy {

    @Override
    public void display() {
        System.out.println("Zombie emerges from the darkness!");
    }

    @Override
    public void attack() {
        System.out.println("Zombie lunges and bites!");
    }

    @Override
    public void move() {
        System.out.println("Zombie walks slowly, driven by an insatiable hunger!");
    }

}
