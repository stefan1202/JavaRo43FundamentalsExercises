package ro.sda.javaro43.solo_w2_co1.task85;

public class Challenge {
    public static int[] MultiplyByLength(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int multiplied = arr[i] * arr.length;
            arr[i] = multiplied;
        }
        return arr;
    }
}