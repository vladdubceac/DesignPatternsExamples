package learning.vladdubceac.design_patterns.creational.abstract_factory.client;

import learning.vladdubceac.design_patterns.creational.abstract_factory.factory.AbstractFactory;
import learning.vladdubceac.design_patterns.creational.abstract_factory.factory.FactoryEnum;
import learning.vladdubceac.design_patterns.creational.abstract_factory.factory.FactoryProducer;
import learning.vladdubceac.design_patterns.creational.abstract_factory.product.color.Color;
import learning.vladdubceac.design_patterns.creational.abstract_factory.product.color.ColorEnum;
import learning.vladdubceac.design_patterns.creational.abstract_factory.product.shape.Shape;
import learning.vladdubceac.design_patterns.creational.abstract_factory.product.shape.ShapeEnum;

public class Client {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryEnum.SHAPE);
        Shape shape1 = shapeFactory.getShape(ShapeEnum.CIRCLE);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(ShapeEnum.SQUARE);
        shape2.draw();

        Shape shape3 = shapeFactory.getShape(ShapeEnum.RECTANGLE);
        shape3.draw();

        // get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryEnum.COLOR);
        Color color1 =colorFactory.getColor(ColorEnum.RED);
        color1.fill();

        Color color2 = colorFactory.getColor(ColorEnum.GREEN);
        color2.fill();

        Color color3 = colorFactory.getColor(ColorEnum.BLUE);
        color3.fill();
    }
}
