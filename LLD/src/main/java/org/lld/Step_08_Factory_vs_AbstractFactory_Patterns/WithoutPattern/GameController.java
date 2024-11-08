package main.java.org.lld.Step_08_Factory_vs_AbstractFactory_Patterns.WithoutPattern;

public class GameController {

    public static void main(String[] args) {

        // Here Client needs to know which enemy class he needs to create
        // The object creation is open to the client
        // While this approach works for a small number of enemy types, it becomes less maintainable as the number of enemy types increases.
        // The Factory Pattern provides a more organized and scalable way to create objects,
        // especially when new enemy types may be added in the future,
        // as it centralizes the object creation logic and separates it from the client code.

        // Create an alien enemy
        Enemy alien = new Alien();
        alien.display();
        alien.attack();
        alien.move();

        // Create a zombie enemy
        Enemy zombie = new Zombie();
        zombie.display();
        zombie.attack();
        zombie.move();

        // Create a robot enemy
        Enemy robot = new Robot();
        robot.display();
        robot.attack();
        robot.move();
    }
}
