package main.java.org.lld.Step_36_CommandPattern.Problem;

public class Main {

    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        ac.setTemperature(21);
        ac.turnOff();
    }
}
