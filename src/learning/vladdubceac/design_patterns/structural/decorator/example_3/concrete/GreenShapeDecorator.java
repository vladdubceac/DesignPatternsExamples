package learning.vladdubceac.design_patterns.structural.decorator.example_3.concrete;

import learning.vladdubceac.design_patterns.structural.decorator.example_3.abstraction.Shape;
import learning.vladdubceac.design_patterns.structural.decorator.example_3.abstraction.ShapeDecorator;

public class GreenShapeDecorator extends ShapeDecorator {
    public GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        Shape component = decoratedShape;
        component.draw();
        setBorder();
    }

    private void setBorder() {
        System.out.println("Border Color : Green");
    }
}
