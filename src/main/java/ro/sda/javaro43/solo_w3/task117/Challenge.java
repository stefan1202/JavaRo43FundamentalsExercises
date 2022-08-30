package ro.sda.javaro43.solo_w3.task117;

public class Challenge {
    public static int search(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (item == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}