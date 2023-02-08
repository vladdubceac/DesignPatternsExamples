package learning.vladdubceac.design_patterns.creational.factory_method.abstract_creator.product.implementation;


import learning.vladdubceac.design_patterns.creational.factory_method.abstract_creator.product.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
