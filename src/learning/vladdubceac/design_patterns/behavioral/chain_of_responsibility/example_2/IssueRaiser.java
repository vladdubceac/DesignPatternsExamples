package learning.vladdubceac.design_patterns.behavioral.chain_of_responsibility.example_2;

public class IssueRaiser {
    ReceiverInterface receiver;

    public IssueRaiser(ReceiverInterface receiver) {
        this.receiver = receiver;
    }

    public void raiseMessage(Message message){
        if(receiver!=null) {
            receiver.processMessage(message);
        }
    }
}
