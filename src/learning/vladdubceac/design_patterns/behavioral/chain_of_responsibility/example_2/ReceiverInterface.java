package learning.vladdubceac.design_patterns.behavioral.chain_of_responsibility.example_2;

public interface ReceiverInterface {
    boolean processMessage(Message message);
    void setNextChain(ReceiverInterface nextChain);
}
