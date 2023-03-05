package learning.vladdubceac.design_patterns.structural.facade.example_2;

public class VegRestaurant implements Hotel {
    @Override
    public Menus getMenus() {
        VegMenu vegMenu = new VegMenu();
        return vegMenu;
    }
}
