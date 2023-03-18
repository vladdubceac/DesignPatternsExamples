package learning.vladdubceac.design_patterns.behavioral.strategy.example_2;

public class OperationMultiply implements Operation {
    @Override
    public double doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
