package main.java.org.lld.Step_31_BridgePattern.Implementation;

public class AirBreathingProcess implements BreatheImplementor {

    @Override
    public void breatheProcess() {
        System.out.println("Air Breathing Process Called");
        // Breathes through Narse
        // Inhales oxygen and exhales carbon dioxide
    }
}
