package learning.vladdubceac.design_patterns.structural.bridge.example_2.implementer;

public class GreenColor implements Color {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Green" +
                " color with "+border+" inch border");
    }
}
