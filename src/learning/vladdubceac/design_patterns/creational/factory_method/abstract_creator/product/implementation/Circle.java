package learning.vladdubceac.design_patterns.creational.factory_method.abstract_creator.product.implementation;


import learning.vladdubceac.design_patterns.creational.factory_method.abstract_creator.product.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
