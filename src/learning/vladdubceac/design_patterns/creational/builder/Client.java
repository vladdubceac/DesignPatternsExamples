package learning.vladdubceac.design_patterns.creational.builder;

import learning.vladdubceac.design_patterns.creational.builder.implementation.Car;
import learning.vladdubceac.design_patterns.creational.builder.implementation.MotorCycle;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***");

        Director director = new Director();

        BuilderInterface carBuilder = new Car();
        BuilderInterface motorcycleBuilder = new MotorCycle();

        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();

        director.construct(motorcycleBuilder);
        Product p2 = motorcycleBuilder.getVehicle();
        p2.show();
    }
}
