package ro.sda.javaro43.solo_w1.task40;

public class FuelUp {
    public static double calculateFuel(double n) {
        if ((n * 10) < 100) {
            return 100;
        } else {
            return n * 10;
        }
    }
}