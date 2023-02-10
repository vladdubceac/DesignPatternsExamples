package learning.vladdubceac.design_patterns.creational.abstract_factory.factory.implementation;

import learning.vladdubceac.design_patterns.creational.abstract_factory.factory.AbstractFactory;
import learning.vladdubceac.design_patterns.creational.abstract_factory.product.color.Color;
import learning.vladdubceac.design_patterns.creational.abstract_factory.product.color.ColorEnum;
import learning.vladdubceac.design_patterns.creational.abstract_factory.product.color.implementation.Blue;
import learning.vladdubceac.design_patterns.creational.abstract_factory.product.color.implementation.Green;
import learning.vladdubceac.design_patterns.creational.abstract_factory.product.color.implementation.Red;
import learning.vladdubceac.design_patterns.creational.abstract_factory.product.shape.Shape;
import learning.vladdubceac.design_patterns.creational.abstract_factory.product.shape.ShapeEnum;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(ColorEnum colorType) {
        if (colorType == null) {
            return null;
        }
        switch (colorType) {
            case RED:
                return new Red();
            case GREEN:
                return new Green();
            case BLUE:
                return new Blue();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(ShapeEnum shapeType) {
        return null;
    }
}
