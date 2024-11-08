package main.java.org.lld.Step_08_Factory_vs_AbstractFactory_Patterns.WithoutPattern;

public class Robot implements Enemy {

    @Override
    public void display() {
        System.out.println("Robot advances with mechanical precision!");
    }

    @Override
    public void attack() {
        System.out.println("Robot fires high-powered lasers at the target!");
    }

    @Override
    public void move() {
        System.out.println("Robot moves swiftly on its tracks!");
    }

}
