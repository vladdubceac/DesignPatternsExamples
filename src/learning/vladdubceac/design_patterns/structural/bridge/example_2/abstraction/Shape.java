package learning.vladdubceac.design_patterns.structural.bridge.example_2.abstraction;

import learning.vladdubceac.design_patterns.structural.bridge.example_2.implementer.Color;

public abstract class Shape {
    protected Color color;
    protected int borderSize;

    protected Shape(Color color) {
        this.color = color;
        borderSize = 1;
    }

    protected Shape(Color color, int borderSize) {
        this(color);
        this.borderSize = borderSize;
    }

    public abstract void drawShape();

    public abstract void modifyBorder(int newBorder);
}
