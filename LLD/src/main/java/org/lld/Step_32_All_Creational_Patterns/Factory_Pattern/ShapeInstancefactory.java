package main.java.org.lld.Step_32_All_Creational_Patterns.Factory_Pattern;

public class ShapeInstancefactory {

    public Shape getShapeInstance(String value) {

        if (value.equals("Circle")) {
            return new Circle();
        } else if (value.equals("Square")) { // If in future we want to change the logic of this Square object, then we can directly do this over here
            // if (value.equals("Square") || value.equals("AnyShape"))
            return new Square();
        }
        return null;
    }
}
