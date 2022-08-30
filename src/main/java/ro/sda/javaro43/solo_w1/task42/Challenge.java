package ro.sda.javaro43.solo_w1.task42;

public class Challenge {
    public static int getArea(int h, int w) {
        if (h <= 0 || w <= 0) {
            return -1;
        } else {
            return h * w;
        }
    }
}