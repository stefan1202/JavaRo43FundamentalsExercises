package ro.sda.javaro43.solo_w2.solo_w3.task111;

public class TotalResistance {
    public static double parallelResistance(int[] r) {
        double result = 0;
        for (int i = 0; i < r.length; i++) {
            double n = r[i];
            result += 1 / n;
        }
        return 1 / result;
    }
}