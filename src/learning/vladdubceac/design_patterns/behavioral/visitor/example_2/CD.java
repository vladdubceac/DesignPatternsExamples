package learning.vladdubceac.design_patterns.behavioral.visitor.example_2;

public class CD implements Visitable {
    private double price;
    private double weight;

    public CD(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
