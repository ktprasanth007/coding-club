package main.java.org.lld.Step_08_Factory_vs_AbstractFactory_Patterns.AbstractFactory;

public class AnimalController {

    public static void main(String[] args) {
        // Get a dog factory
        AnimalFactory dogFactory = new DogFactory();

        // Create a dog
        Animal dog = dogFactory.createAnimal();
        dog.makeSound(); // Output: Dog says: Woof!

        // Get a cat factory
        AnimalFactory catFactory = new CatFactory();

        // Create a cat
        Animal cat = catFactory.createAnimal();
        cat.makeSound(); // Output: Cat says: Meow!
    }

}
