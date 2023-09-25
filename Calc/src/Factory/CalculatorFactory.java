package Factory;

import Functionality.*;

public class CalculatorFactory {
    public static IOperation createOperation(OperationType opType){
        switch (opType){
            case ADDITION -> {
                return new AdditionOperation();
            }
            case SUBTRACTION -> {
                return new SubtractionOperation();
            }
            case MULTIPLICATION -> {
                return new MultiplicationOperation();
            }
            case DIVISION -> {
                return new DivisionOperation();
            }
            default -> {
                return null;
            }
        }
    }
}
