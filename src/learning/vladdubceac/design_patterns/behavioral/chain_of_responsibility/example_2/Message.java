package learning.vladdubceac.design_patterns.behavioral.chain_of_responsibility.example_2;

public class Message {
    private String text;
    private MessagePriority messagePriority;

    public Message(String text, MessagePriority messagePriority) {
        this.text = text;
        this.messagePriority = messagePriority;
    }

    public String getText() {
        return text;
    }

    public MessagePriority getMessagePriority() {
        return messagePriority;
    }
}
