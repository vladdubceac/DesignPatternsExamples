package learning.vladdubceac.design_patterns.structural.decorator.example_1.implementation;

import learning.vladdubceac.design_patterns.structural.decorator.example_1.abstraction.AbstractDecorator;

public class ConcreteDecorate2 extends AbstractDecorator {
    public void doJob(){

        System.out.println("");
        System.out.println("*** START Decorate 2 ***");

        super.doJob();

        // Add additional thing if necessary
        System.out.println("Explicitly from Concrete Decorate 2");
        System.out.println("*** END. Concrete Decorate 2 ***");
    }
}
