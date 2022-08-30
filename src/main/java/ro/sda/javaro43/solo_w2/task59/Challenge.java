package ro.sda.javaro43.solo_w2.task59;

public class Challenge {
    public static boolean both(int n1, int n2) {
        return ((n1 == 0 && n2 == 0) || (n1 > 0 && n2 > 0) || (n1 < 0 && n2 < 0));
    }
}