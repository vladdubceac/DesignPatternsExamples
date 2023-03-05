package learning.vladdubceac.design_patterns.structural.decorator.example_3.concrete;

import learning.vladdubceac.design_patterns.structural.decorator.example_3.abstraction.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectanlge");
    }
}
