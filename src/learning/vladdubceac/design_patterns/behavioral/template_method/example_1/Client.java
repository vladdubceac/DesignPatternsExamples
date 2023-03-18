package learning.vladdubceac.design_patterns.behavioral.template_method.example_1;

public class Client {

    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();

        // using template method
        houseType.buildHouse();

        System.out.println("**********");

        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
