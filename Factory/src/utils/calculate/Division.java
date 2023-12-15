package utils.calculate;

import interfaces.Calculate;

public class Division implements Calculate {
    @Override
    public Double execute(double x, double y) {
        return x / y;
    }
}
