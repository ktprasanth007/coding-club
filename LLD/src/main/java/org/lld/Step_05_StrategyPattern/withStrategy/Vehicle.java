package main.java.org.lld.Step_05_StrategyPattern.withStrategy;

import main.java.org.lld.Step_05_StrategyPattern.withStrategy.strategy.DriveStrategy;

// This acts as a Context class ->
public class Vehicle {

    DriveStrategy driveStrategy;

    // This is called constructor injection
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }

}
