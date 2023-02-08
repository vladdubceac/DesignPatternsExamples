package learning.vladdubceac.design_patterns.creational.factory_method.static_method.client;

import learning.vladdubceac.design_patterns.creational.factory_method.static_method.factory.ShapeFactory;
import learning.vladdubceac.design_patterns.creational.factory_method.static_method.product.Shape;

public class Client {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape(ShapeFactory.CIRCLE);
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape(ShapeFactory.SQUARE);
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape(ShapeFactory.RECTANGLE);
        shape3.draw();
    }
}
