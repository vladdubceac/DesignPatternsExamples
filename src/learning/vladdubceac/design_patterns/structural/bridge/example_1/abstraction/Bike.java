package learning.vladdubceac.design_patterns.structural.bridge.example_1.abstraction;

import learning.vladdubceac.design_patterns.structural.bridge.example_1.implementation.Workshop;

public class Bike extends Vehicle {
    public Bike(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.println("\n\tBike");
        workshop1.work();
        workshop2.work();
    }
}
