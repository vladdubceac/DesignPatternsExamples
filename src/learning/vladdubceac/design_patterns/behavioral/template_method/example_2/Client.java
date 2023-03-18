package learning.vladdubceac.design_patterns.behavioral.template_method.example_2;

public class Client {

    public static void main(String[] args) {
        OrderProcessTemplate netOrder = new NetOrder();
        netOrder.processOrder(true);

        System.out.println("----- Changed the template to a store order -----");

        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(true);
    }
}
