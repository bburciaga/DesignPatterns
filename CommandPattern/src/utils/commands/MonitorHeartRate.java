package utils.commands;

import interfaces.Command;
import utils.receiver.HeartRate;

import java.util.Arrays;

public class MonitorHeartRate implements Command {
    private HeartRate heartRate;

    public MonitorHeartRate(HeartRate heartRate) {
        this.heartRate = heartRate;
    }

    public void execute() {
        System.out.println(Arrays.toString(heartRate.getValues()));
    }
}
