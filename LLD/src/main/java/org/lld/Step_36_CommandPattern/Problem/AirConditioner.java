package main.java.org.lld.Step_36_CommandPattern.Problem;

public class AirConditioner {

    boolean isOn;
    int temperature;

    public void turnOn() {
        isOn = true;
        System.out.println("AC is ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("AC is OFF");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature is set to : " + temperature);
    }

}
