package learning.vladdubceac.design_patterns.behavioral.strategy.example_2;

public class OperationDivide implements Operation {
    @Override
    public double doOperation(int num1, int num2) {
        if(num2==0){
            System.out.println("Division by 0 !");
            return Double.MIN_VALUE;
        }
        return (double)(num1/num2);
    }
}
