package utils.observers;

import interfaces.Display;
import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;

public class Statistics implements Observer, Display {
    private ArrayList<Double> temperatureList;
    private double aveTemperature;
    private double minTemperature;
    private double maxTemperature;
    private ArrayList<Double> humidityList;
    private double aveHumidity;
    private double minHumidity;
    private double maxHumidity;
    private ArrayList<Double> pressureList;
    private double avePressure;
    private double minPressure;
    private double maxPressure;

    public Statistics(Subject weatherStation) {
        temperatureList = new ArrayList<>();
        humidityList = new ArrayList<>();
        pressureList = new ArrayList<>();
        minTemperature = 999;
        minHumidity = 999;
        minPressure = 999;
        maxTemperature = -999;
        maxHumidity = -999;
        maxPressure = -999;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        temperatureList.add(temperature);
        humidityList.add(humidity);
        pressureList.add(pressure);
        double temperatureSum = 0;
        double humiditySum = 0;
        double pressureSum = 0;

        for (double value : temperatureList) {
            if (value < minTemperature) minTemperature = value;
            if (value > maxTemperature) maxTemperature = value;
            temperatureSum += value;
        }

        for (double value : humidityList) {
            if (value < minHumidity) minHumidity = value;
            if (value > maxHumidity) maxHumidity = value;
            humiditySum += value;
        }

        for (double value : pressureList) {
            if (value < minPressure) minPressure = value;
            if (value > maxPressure) maxPressure = value;
            pressureSum += value;
        }

        int size = temperatureList.size();
        aveTemperature = temperatureSum / size;
        aveHumidity = humiditySum / size;
        avePressure = pressureSum / size;
        display();
    }

    @Override
    public void display() {
        System.out.println("============================= Statistics Display =================================");
        System.out.println("\n");
        System.out.println("Temperature - Average: " + aveTemperature + ", Min: " + minTemperature + ", Max: " + maxTemperature );
        System.out.println("Pressure - Average: " + avePressure + ", Min: " + minPressure + ", Max: " + maxPressure );
        System.out.println("Humidity - Average: " + aveHumidity + ", Min: " + minHumidity + ", Max: " + maxHumidity );
        System.out.println("\n");
        System.out.println("==================================================================================");    }
}
