package main.java.org.lld.Step_05_StrategyPattern.withStrategy.strategy;

public class SportsDriveStrategy implements DriveStrategy {

    @Override
    public void drive(){
        System.out.println("Sports drive capability");
    }
}
