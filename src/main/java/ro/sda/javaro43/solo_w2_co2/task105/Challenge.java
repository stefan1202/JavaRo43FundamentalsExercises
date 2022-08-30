package ro.sda.javaro43.solo_w2_co2.task105;

public class Challenge {
    public static int[] correctStream(String[] user, String[] correct) {
        int[] arr = new int[user.length];
        int i = 0;

        while (i < user.length) {
            if (user[i].equals(correct[i])) {
                arr[i] = 1;
            } else {
                arr[i] = -1;
            }
            i++;
        }

        return arr;
    }
}