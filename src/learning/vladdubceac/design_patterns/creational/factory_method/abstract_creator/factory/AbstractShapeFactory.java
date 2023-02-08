package learning.vladdubceac.design_patterns.creational.factory_method.abstract_creator.factory;


import learning.vladdubceac.design_patterns.creational.factory_method.abstract_creator.product.Shape;

public abstract class AbstractShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape(){
        return factoryMethod();
    }

    // other helper methods
}
