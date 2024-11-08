package main.java.org.lld.Step_32_All_Creational_Patterns.Factory_Pattern;

public class Main {

    public static void main(String[] args) {
        ShapeInstancefactory factoryObj = new ShapeInstancefactory();
        Shape circleObj = factoryObj.getShapeInstance("Circle");
        circleObj.computeArea();
    }

}
