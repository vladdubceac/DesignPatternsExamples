package learning.vladdubceac.design_patterns.structural.decorator.example_1.implementation;

import learning.vladdubceac.design_patterns.structural.decorator.example_1.abstraction.Component;

public class ConcreteComponent extends Component {
    @Override
    public void doJob() {
        System.out.println("I am from a Concrete Component - I am closed for modification");
    }
}
