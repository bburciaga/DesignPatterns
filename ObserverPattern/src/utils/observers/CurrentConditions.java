package utils.observers;

import interfaces.Display;
import interfaces.Observer;
import interfaces.Subject;

public class CurrentConditions implements Observer, Display {
    private double temperature;
    private double humidity;
    private double pressure;

    public CurrentConditions (Subject weatherStation) {
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("============================== Current Conditions =================================");
        System.out.println("\n");
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity and " + pressure + "pressure." );
        System.out.println("\n");
        System.out.println("===================================================================================");
    }
}
