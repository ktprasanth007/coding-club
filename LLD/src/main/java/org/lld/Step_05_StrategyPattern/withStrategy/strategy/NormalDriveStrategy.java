package main.java.org.lld.Step_05_StrategyPattern.withStrategy.strategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive(){
        System.out.println("Normal drive capability");
    }
}
