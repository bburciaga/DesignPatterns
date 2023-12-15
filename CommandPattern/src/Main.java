import utils.Invoker;
import utils.commands.MonitorHeartRate;
import utils.commands.MonitorTemperature;
import utils.receiver.HeartRate;
import utils.receiver.Temperature;

public class Main {
    public static void main(String[] args) {
        Temperature t = new Temperature();
        HeartRate heartrate = new HeartRate();
        MonitorTemperature mt = new MonitorTemperature(t);
        MonitorHeartRate mh = new MonitorHeartRate(heartrate);
        Invoker invoker = new Invoker();
        invoker.setCommand(0, mt);
        invoker.pressButton(0);
        invoker.setCommand(1, mh);
        invoker.pressButton(1);    }
}