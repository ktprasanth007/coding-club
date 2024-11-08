package main.java.org.lld.Step_31_BridgePattern.Implementation;

// This class is created separately without being used by any of the abstract class and this is possible because of Bridge Design Patterm
public class AlienBreathingProcess implements BreatheImplementor {

    @Override
    public void breatheProcess() {
        System.out.println("Alien Breathing Process Called");
        // Breathes through mouth
        // Inhales carbon dioxide and exhales carbon dioxide
    }
}
