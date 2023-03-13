package learning.vladdubceac.design_patterns.behavioral.mediator.example_1;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void  receive(String message);
}
