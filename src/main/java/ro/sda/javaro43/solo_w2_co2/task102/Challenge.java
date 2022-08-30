package ro.sda.javaro43.solo_w2_co2.task102;

public class Challenge {
    public static int search(int arr[], int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }
}