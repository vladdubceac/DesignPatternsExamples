package learning.vladdubceac.design_patterns.creational.factory_method.static_method.factory;

import learning.vladdubceac.design_patterns.creational.factory_method.static_method.product.Shape;
import learning.vladdubceac.design_patterns.creational.factory_method.static_method.product.implementation.Circle;
import learning.vladdubceac.design_patterns.creational.factory_method.static_method.product.implementation.Rectangle;
import learning.vladdubceac.design_patterns.creational.factory_method.static_method.product.implementation.Square;

public class ShapeFactory {
    public static final String CIRCLE = "circle";
    public static final String SQUARE = "square";
    public static final String RECTANGLE = "rectangle";

    public static Shape getShape(String shapeType){
        if(shapeType==null || shapeType.isBlank()){
            return null;
        }
        switch (shapeType){
            case CIRCLE : return new Circle();
            case SQUARE : return new Square();
            case RECTANGLE: return new Rectangle();
            default: return null;
        }
    }
}
