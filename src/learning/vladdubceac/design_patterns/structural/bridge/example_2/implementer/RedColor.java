package learning.vladdubceac.design_patterns.structural.bridge.example_2.implementer;

public class RedColor implements Color {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Red color with "+border+" inch border");
    }
}
