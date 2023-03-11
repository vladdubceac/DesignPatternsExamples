package learning.vladdubceac.design_patterns.behavioral.command.example_2;

public class BuyStock implements Order {
    private Stock myStock;

    public BuyStock(Stock myStock) {
        this.myStock = myStock;
    }

    @Override
    public void execute() {
        myStock.buy();
    }
}
