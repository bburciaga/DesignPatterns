package utils;

import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;

public class WeatherStation implements Subject {
    private final ArrayList<Observer> observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (0 <= i)
            observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notifying all observers...");
        for (Observer value : observers) {
            ((Observer) value).update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObservers();
    }
}
