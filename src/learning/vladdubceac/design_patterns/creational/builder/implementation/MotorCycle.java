package learning.vladdubceac.design_patterns.creational.builder.implementation;

import learning.vladdubceac.design_patterns.creational.builder.BuilderInterface;
import learning.vladdubceac.design_patterns.creational.builder.Product;

public class MotorCycle implements BuilderInterface {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a Motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("1 headlight is added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
