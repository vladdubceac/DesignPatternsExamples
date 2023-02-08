package learning.vladdubceac.design_patterns.creational.factory_method.abstract_creator.factory.implementation;


import learning.vladdubceac.design_patterns.creational.factory_method.abstract_creator.factory.AbstractShapeFactory;
import learning.vladdubceac.design_patterns.creational.factory_method.abstract_creator.product.Shape;
import learning.vladdubceac.design_patterns.creational.factory_method.abstract_creator.product.implementation.Circle;

public class CircleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
