package utils.observers;

import interfaces.Display;
import interfaces.Observer;
import interfaces.Subject;

public class HeatIndex implements Observer, Display {
    private double temperature;
    private double humidity;
    private double index;

    public HeatIndex (Subject weatherStation) {
        weatherStation.registerObserver(this);
    }

    private void calculateIndex() {
        double tempSquared = Math.pow(temperature, 2);
        double tempCubed = Math.pow(temperature, 3);
        double humSquared = Math.pow(humidity, 2);
        double humCubed = Math.pow(humidity, 3);

        index =  (
            16.923 + (0.185212 * temperature)
                    + (5.37941 * humidity)
                    - (0.100254 * temperature * humidity)
                    + (0.00941695 * tempSquared)
                    + (0.00728898 * humSquared)
                    + (0.000345372 * tempSquared * humidity)
                    - (0.000814971 * temperature * humSquared)
                    + (0.0000102102 * tempSquared * humSquared)
                    - (0.000038646 * tempCubed)
                    + (0.0000291583 * humCubed)
                    + (0.00000142721 * tempCubed * humidity)
                    + (0.000000197483 * temperature * humCubed)
                    - (0.0000000218429 * tempCubed * humSquared)
                    + (0.000000000843296 * tempSquared * humCubed)
                    - (0.0000000000481975 * tempCubed * humCubed)
        );
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        calculateIndex();
        display();
    }

    @Override
    public void display() {
        System.out.println("==================== Heat Index ====================");
        System.out.println("\n");
        System.out.println("The heat index for the weather is: " + index);
        System.out.println("\n");
        System.out.println("====================================================");    }
}
