package ro.sda.javaro43.solo_w1.task46;

public class PerValueOrSum {
    public static boolean makesTen(int a, int b) {
        int sum = a + b;
        return ((a == 10 || b == 10)|| sum == 10);
    }
}