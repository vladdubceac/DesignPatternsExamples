package learning.vladdubceac.design_patterns.behavioral.command.example_2;

public class SellStock implements Order {
    private Stock myStock;

    public SellStock(Stock myStock) {
        this.myStock = myStock;
    }

    @Override
    public void execute() {
        myStock.sell();
    }
}
