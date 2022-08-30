package ro.sda.javaro43.solo_w2_co1.task95;

public class Challenge {
    public static int indexMultiplier(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i] * i;
        }
        return sum;
    }
}