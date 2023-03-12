package learning.vladdubceac.design_patterns.behavioral.interpreter.example_2;

public class Context {
    String input;

    public Context(String input) {
        this.input = input;
    }

    public boolean getResult(String data){
        return input.contains(data);
    }
}
