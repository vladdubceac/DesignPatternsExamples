package learning.vladdubceac.design_patterns.behavioral.memento.example_2;

public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
