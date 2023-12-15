package utils.receiver;

public class HeartRate {
    private int[] value = new int[2];

    public HeartRate() {
        value[0] = 120;
        value[1] = 70;
    }

    public int[] getValues() {
        return value;
    }
}
