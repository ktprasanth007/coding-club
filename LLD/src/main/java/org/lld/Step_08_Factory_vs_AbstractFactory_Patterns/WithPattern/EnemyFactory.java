package main.java.org.lld.Step_08_Factory_vs_AbstractFactory_Patterns.WithPattern;

public class EnemyFactory {

    public Enemy createEnemy(String enemyType) {
        if ("alien".equalsIgnoreCase(enemyType)) {
            return new Alien();
        } else if ("zombie".equalsIgnoreCase(enemyType)) {
            return new Zombie();
        } else if ("robot".equalsIgnoreCase(enemyType)) {
            return new Robot();
        }
        return null; // Return null or throw an exception for unsupported enemy types.
    }

}
