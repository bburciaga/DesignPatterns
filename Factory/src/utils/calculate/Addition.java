package utils.calculate;

import interfaces.Calculate;

public class Addition implements Calculate {
    public Double execute(double x, double y) {
        return x + y;
    }
}
