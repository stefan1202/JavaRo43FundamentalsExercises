package ro.sda.javaro43.solo_w2_co2.task108;

public class Challenge {
    public static boolean checkFactors(int[] factors, int num) {
        for (int i : factors)
            if (num % i != 0) {
                return false;
            }
        return true;
    }
}