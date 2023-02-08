package learning.vladdubceac.design_patterns.creational.factory_method.static_method.product.implementation;

import learning.vladdubceac.design_patterns.creational.factory_method.static_method.product.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside "+getClass().getSimpleName()+"::draw() method.");
    }
}
