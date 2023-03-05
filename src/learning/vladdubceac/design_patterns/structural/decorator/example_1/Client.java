package learning.vladdubceac.design_patterns.structural.decorator.example_1;

import learning.vladdubceac.design_patterns.structural.decorator.example_1.implementation.ConcreteComponent;
import learning.vladdubceac.design_patterns.structural.decorator.example_1.implementation.ConcreteDecorate1;
import learning.vladdubceac.design_patterns.structural.decorator.example_1.implementation.ConcreteDecorate2;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** Decorator pattern Demo ***");
        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecorate1 cd1 = new ConcreteDecorate1();

        // Decorating ConcreteComponent Object cc with ConcreteDecorator1
        cd1.setComponent(cc);
        cd1.doJob();

        ConcreteDecorate2 cd2=new ConcreteDecorate2();

        // Decorating ConcreteComponent Object cc with ConcreteDecorator1 & ConcreteDecorator2
        cd2.setComponent(cd1);
        cd2.doJob();
    }
}
