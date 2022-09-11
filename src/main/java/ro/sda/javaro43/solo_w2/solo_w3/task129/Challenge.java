package ro.sda.javaro43.solo_w2.solo_w3.task129;

public class Challenge {
    public static int charCount(char c, String str) {
        int count = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                count++;
            }
        }
        return count;
    }
}