package Functionality;

public class DivisionOperation implements IOperation{
    double result;
    @Override
    public double Perform(double firstArg, double secondArg) throws Exception {
        try {
            if(secondArg == 0){
                throw new ArithmeticException("DIVISION BY ZERO");
            }
            result = firstArg / secondArg;
        }catch (Exception e) {
            throw new Exception();
        }
        return result;
    }
}
