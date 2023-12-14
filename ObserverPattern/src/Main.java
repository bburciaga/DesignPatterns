import utils.WeatherStation;
import utils.observers.*;

public class Main {
    public static void main(String[] args) {
        WeatherStation w = new WeatherStation();
        //create display objects to implement observer, displayelement
        Statistics f = new Statistics(w);
        Statistics s = new Statistics(w);
        HeatIndex hd = new HeatIndex(w);
        //set measurements to test observers
        w.setMeasurements(23.4F, 13.5F, 29.8F);
        w.setMeasurements(25.4F, 10.2F, 32.2F);    }
}