package ro.sda.javaro43.solo_w2.solo_w3.task110;

public class Challenge {
    public static int[] mysteryFunc(int[] arr, int num) {
        int[] reminders = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reminders[i] = arr[i] % num;
        }
        return reminders;
    }
}