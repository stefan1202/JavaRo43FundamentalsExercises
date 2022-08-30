package ro.sda.javaro43.solo_w2_co2.task101;

public class Challenge {
    public static int[] transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                int sum1 = arr[i] + 1;
                arr[i] = sum1;
            } else {
                int sum2 = arr[i] - 1;
                arr[i] = sum2;
            }
        }
        return arr;
    }
}