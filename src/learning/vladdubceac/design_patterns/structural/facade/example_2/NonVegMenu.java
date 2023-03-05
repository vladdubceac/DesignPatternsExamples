package learning.vladdubceac.design_patterns.structural.facade.example_2;

public class NonVegMenu implements Menus {
    public NonVegMenu() {
        System.out.println("Creating a Non-Veg menu");
    }

    @Override
    public void showMenu() {
        System.out.println("Menu items in Non-Veg menu");
    }
}
