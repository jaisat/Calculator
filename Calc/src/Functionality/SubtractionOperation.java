package Functionality;

public class SubtractionOperation implements IOperation{
    @Override
    public double Perform(double firstArg, double secondArg) {
        return firstArg - secondArg;
    }
}
