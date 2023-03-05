package learning.vladdubceac.design_patterns.structural.decorator.example_1.implementation;

import learning.vladdubceac.design_patterns.structural.decorator.example_1.abstraction.AbstractDecorator;

public class ConcreteDecorate1 extends AbstractDecorator {
    public void doJob(){
        super.doJob();

        // add additional responsibilities
        System.out.println("I am explicitly from ConcreteDecorate1");
    }
}
