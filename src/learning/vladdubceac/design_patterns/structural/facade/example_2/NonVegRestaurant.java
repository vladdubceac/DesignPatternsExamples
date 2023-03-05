package learning.vladdubceac.design_patterns.structural.facade.example_2;

public class NonVegRestaurant implements Hotel {
    @Override
    public Menus getMenus() {
        NonVegMenu nonVegMenu = new NonVegMenu();
        return nonVegMenu;
    }
}
