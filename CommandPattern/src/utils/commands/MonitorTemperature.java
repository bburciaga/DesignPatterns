package utils.commands;

import interfaces.Command;
import utils.receiver.Temperature;

public class MonitorTemperature implements Command {
    Temperature temperature;

    public MonitorTemperature (Temperature temperature) {
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        System.out.println(temperature.getValue());
    }
}
