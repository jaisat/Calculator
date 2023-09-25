package Functionality;

public class MultiplicationOperation implements IOperation{
    @Override
    public double Perform(double firstArg, double secondArg) {
        return firstArg * secondArg;
    }
}
