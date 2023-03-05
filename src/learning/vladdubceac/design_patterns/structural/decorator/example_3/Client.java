package learning.vladdubceac.design_patterns.structural.decorator.example_3;

import learning.vladdubceac.design_patterns.structural.decorator.example_3.abstraction.Shape;
import learning.vladdubceac.design_patterns.structural.decorator.example_3.concrete.Circle;
import learning.vladdubceac.design_patterns.structural.decorator.example_3.concrete.Rectangle;
import learning.vladdubceac.design_patterns.structural.decorator.example_3.concrete.RedShapeDecorator;

public class Client {

    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectanlge = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectanlge.draw();
    }
}
