package learning.vladdubceac.design_patterns.structural.facade.example_2;

public class VegNonBothRestaurant implements Hotel {
    @Override
    public Menus getMenus() {
        Both both = new Both();
        return both;
    }
}
