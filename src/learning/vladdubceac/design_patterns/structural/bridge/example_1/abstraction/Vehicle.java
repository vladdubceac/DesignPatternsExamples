package learning.vladdubceac.design_patterns.structural.bridge.example_1.abstraction;

import learning.vladdubceac.design_patterns.structural.bridge.example_1.implementation.Workshop;

public abstract class Vehicle {
    protected Workshop workshop1;
    protected Workshop workshop2;

    public Vehicle(Workshop workshop1, Workshop workshop2) {
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }

    public abstract void manufacture();
}
