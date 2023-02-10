package learning.vladdubceac.design_patterns.creational.abstract_factory.product.color.implementation;

import learning.vladdubceac.design_patterns.creational.abstract_factory.product.color.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method");
    }
}
