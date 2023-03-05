package learning.vladdubceac.design_patterns.structural.facade.example_2;

public class VegMenu implements Menus {
    public VegMenu() {
        System.out.println("Creating a Vegetarian menu");
    }

    @Override
    public void showMenu() {
        System.out.println("Menu items in Vegetarian menu");
    }
}
