package Functionality;

public class AdditionOperation implements IOperation{
    @Override
    public double Perform(double firstArg, double secondArg) {
        return firstArg + secondArg;
    }
}
