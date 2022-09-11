package ro.sda.javaro43.solo_w2.solo_w3.task124;

public class Challenge {
    public static int minimumRemovals(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 == 0) {
            return 0;
        }
        return 1;
    }
}