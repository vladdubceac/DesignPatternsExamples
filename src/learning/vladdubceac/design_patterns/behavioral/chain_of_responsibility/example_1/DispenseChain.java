package learning.vladdubceac.design_patterns.behavioral.chain_of_responsibility.example_1;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}
