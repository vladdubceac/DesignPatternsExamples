package learning.vladdubceac.design_patterns.structural.bridge.example_1.abstraction;

import learning.vladdubceac.design_patterns.structural.bridge.example_1.implementation.Workshop;

public class Car extends Vehicle {
    public Car(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.println("\n\tCar");
        workshop1.work();
        workshop2.work();
    }
}
