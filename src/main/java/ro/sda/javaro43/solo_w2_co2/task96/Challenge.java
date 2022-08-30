package ro.sda.javaro43.solo_w2_co2.task96;

public class Challenge {
    public static int[] additiveInverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= -1;
        }
        return arr;
    }
}