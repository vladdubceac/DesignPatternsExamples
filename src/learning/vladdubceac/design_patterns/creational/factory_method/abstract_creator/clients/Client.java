package learning.vladdubceac.design_patterns.creational.factory_method.abstract_creator.clients;


import learning.vladdubceac.design_patterns.creational.factory_method.abstract_creator.factory.implementation.CircleFactory;
import learning.vladdubceac.design_patterns.creational.factory_method.abstract_creator.factory.implementation.RectangleFactory;
import learning.vladdubceac.design_patterns.creational.factory_method.abstract_creator.factory.implementation.SquareFactory;
import learning.vladdubceac.design_patterns.creational.factory_method.abstract_creator.product.Shape;

public class Client {
    public static void main(String[] args) {
        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();

        Shape shape2 = new RectangleFactory().getShape();
        shape2.draw();

        Shape shape3 = new SquareFactory().getShape();
        shape3.draw();
    }
}
