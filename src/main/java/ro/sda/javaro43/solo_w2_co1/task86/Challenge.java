package ro.sda.javaro43.solo_w2_co1.task86;

public class Challenge {
    public static String[] firstLast(String[] arr) {
        String[] newArr = new String[2];
//        for (int i = 0; i < arr.length; i++) {
        String a = arr[0];
        newArr[0] = a;
        String b = arr[arr.length - 1];
        newArr[1] = b;
        return newArr;
    }
}