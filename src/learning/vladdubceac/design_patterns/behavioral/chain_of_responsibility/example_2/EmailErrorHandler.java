package learning.vladdubceac.design_patterns.behavioral.chain_of_responsibility.example_2;

public class EmailErrorHandler implements ReceiverInterface {
    public static final String KEYWORD = "email";
    private ReceiverInterface nextHandler;

    @Override
    public boolean processMessage(Message message) {
        String text = message.getText();
        MessagePriority priority = message.getMessagePriority();
        if (text.toLowerCase().contains(KEYWORD)) {
            System.out.println("EmailErrorHandler processed " + priority + " priority issue : " + text);
            return true;
        } else {
            if (nextHandler != null) {
                return nextHandler.processMessage(message);
            } else {
                System.out.println("Cannot handle the issue with " + priority + " priority : " + text + " ! ");
                return false;
            }
        }
    }

    @Override
    public void setNextChain(ReceiverInterface nextChain){
        nextHandler = nextChain;
    }
}
