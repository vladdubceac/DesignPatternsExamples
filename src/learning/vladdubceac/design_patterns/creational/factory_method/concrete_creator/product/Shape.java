package learning.vladdubceac.design_patterns.creational.factory_method.concrete_creator.product;

public interface Shape {
    default void draw(){
        System.out.println("Inside "+getClass().getSimpleName() + "::draw() method.");
    };
}
