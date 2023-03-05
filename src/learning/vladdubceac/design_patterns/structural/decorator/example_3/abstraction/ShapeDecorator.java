package learning.vladdubceac.design_patterns.structural.decorator.example_3.abstraction;

public abstract class ShapeDecorator  implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
