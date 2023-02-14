package learning.vladdubceac.design_patterns.creational.builder;

public class Director {
    private BuilderInterface myBuilder;

    public void construct(BuilderInterface builder){
        myBuilder = builder;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadlights();
    }
}
