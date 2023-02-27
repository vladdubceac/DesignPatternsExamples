package learning.vladdubceac.design_patterns.structural.adapter.object_composition.example_1.implementation;

import learning.vladdubceac.design_patterns.structural.adapter.object_composition.example_1.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble-gobble");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }
}
