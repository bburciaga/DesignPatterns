package abstracts;

import interfaces.Calculate;

public abstract class CalculationFactory {
    abstract Calculate createCalculation(char operator);
}
