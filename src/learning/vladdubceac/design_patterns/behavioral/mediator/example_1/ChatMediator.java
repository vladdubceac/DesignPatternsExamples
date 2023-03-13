package learning.vladdubceac.design_patterns.behavioral.mediator.example_1;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
