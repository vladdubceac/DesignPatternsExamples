package learning.vladdubceac.design_patterns.creational.abstract_factory.factory;

import learning.vladdubceac.design_patterns.creational.abstract_factory.factory.implementation.ColorFactory;
import learning.vladdubceac.design_patterns.creational.abstract_factory.factory.implementation.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(FactoryEnum factoryType) {
        if (factoryType == null) {
            return null;
        }
        switch (factoryType) {
            case SHAPE:
                return new ShapeFactory();
            case COLOR:
                return new ColorFactory();
        }
        return null;
    }
}
