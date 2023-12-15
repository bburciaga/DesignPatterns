package utils.calculate;

import interfaces.Calculate;

public class Subtraction implements Calculate {
    @Override
    public Double execute(double x, double y) {
        return x - y;
    }
}
