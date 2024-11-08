package main.java.org.lld.Step_31_BridgePattern.Abstraction;

import main.java.org.lld.Step_31_BridgePattern.Implementation.BreatheImplementor;

// Because of this pattern, if we want to extend any other class to this Living thing we can do it,
// and it can implement any of the existing breathing process or else we can even create a new breathing process independently
public abstract class LivingThings {

    BreatheImplementor breatheImplementor;

    LivingThings(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    abstract public void breatheProcess();

}
