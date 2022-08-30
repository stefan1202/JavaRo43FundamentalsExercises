package ro.sda.javaro43.solo_w2_co1.task77;

public class Challenge {
    public static boolean isLeap(int year) {
        return ((year % 4 == 0) && !(year % 100 == 0)) || year % 400 == 0;
    }
}