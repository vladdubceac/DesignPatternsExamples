package learning.vladdubceac.design_patterns.structural.adapter.object_composition.example_1.implementation;

import learning.vladdubceac.design_patterns.structural.adapter.object_composition.example_1.Duck;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
