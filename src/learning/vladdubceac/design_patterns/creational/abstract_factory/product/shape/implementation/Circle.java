package learning.vladdubceac.design_patterns.creational.abstract_factory.product.shape.implementation;

import learning.vladdubceac.design_patterns.creational.abstract_factory.product.shape.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
