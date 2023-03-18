package learning.vladdubceac.design_patterns.behavioral.strategy.example_2;

public class StrategyPatternDemo {

    public static void main(String[] args) {
        // Create context
        StrategyContext context = new StrategyContext();

        // Create strategies
        Operation addition = new OperationAdd();
        Operation substract = new OperationSubstract();
        Operation multiplication = new OperationMultiply();

        int num1 = 10;
        int num2 = 5;
        double result = context.doOperation(addition, num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + result);

        result = context.doOperation(substract, num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + result);

        result = context.doOperation(multiplication, num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + result);

        result = context.doOperation(new OperationDivide(), num1,num2);
        System.out.println(num1 + " / " + num2 + " = " + result);
    }
}
