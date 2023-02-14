package learning.vladdubceac.design_patterns.creational.builder;

public interface BuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Product getVehicle();
}
