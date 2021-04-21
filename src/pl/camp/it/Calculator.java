package pl.camp.it;

public class Calculator {
    public double divide(double a, double b) throws DivideByZeroException {
        if(b == 0.0) {
            throw new DivideByZeroException("Dzielisz przez zero !!!");
        }
        return a/b;
    }
}
