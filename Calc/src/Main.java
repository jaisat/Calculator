import Factory.CalculatorFactory;
import Functionality.IOperation;
import Functionality.OperationType;

public class Main {
    public static void main(String[] args) throws Exception {
        IOperation operation = CalculatorFactory.createOperation(OperationType.DIVISION);
        double result = operation.Perform(2, 0);
        System.out.println(result);
    }
}