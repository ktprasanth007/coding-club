package main.java.org.lld.Step_08_Factory_vs_AbstractFactory_Patterns.WithPattern;

public class GameController {

    public static void main(String[] args) {
        EnemyFactory enemyFactory = new EnemyFactory();

        // Create an alien enemy
        Enemy alien = enemyFactory.createEnemy("alien");
        alien.display();
        alien.attack();
        alien.move();

        // Create a zombie enemy
        Enemy zombie = enemyFactory.createEnemy("zombie");
        zombie.display();
        zombie.attack();
        zombie.move();

        // Create a robot enemy
        Enemy robot = enemyFactory.createEnemy("robot");
        robot.display();
        robot.attack();
        robot.move();
    }

}
