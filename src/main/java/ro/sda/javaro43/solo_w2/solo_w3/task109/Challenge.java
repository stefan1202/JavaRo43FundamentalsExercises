package ro.sda.javaro43.solo_w2.solo_w3.task109;

public class Challenge {
    public static String Go(int num) {
        if (num <= 1) {
            return "-";
        }
        return "-" + Go(num - 1);
    }
}