package learning.vladdubceac.design_patterns.behavioral.chain_of_responsibility.example_1;

public class Dollar10Dispenser implements DispenseChain {
private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
    chain=nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        int amount = currency.getAmount();
        if(amount>=10){
            int num = amount/10;
            System.out.println("Dispensing "+num+" 10$ notes.");
        }
    }
}
