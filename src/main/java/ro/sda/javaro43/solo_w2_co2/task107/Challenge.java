package ro.sda.javaro43.solo_w2_co2.task107;

public class Challenge {
    public static boolean hurdleJump(int[] hurdles, int h) {
        for (int i = 0; i < hurdles.length; i++) {
            if (h < hurdles[i]) {
                return false;
            }
        }
        return true;
    }
}