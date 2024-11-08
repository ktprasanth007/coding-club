package main.java.org.lld.Step_08_Factory_vs_AbstractFactory_Patterns.AbstractFactory;

public class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
