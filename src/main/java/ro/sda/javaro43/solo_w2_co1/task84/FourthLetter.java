package ro.sda.javaro43.solo_w2_co1.task84;

public class FourthLetter {
    public static int countDs(String s) {
//        int count = 0;
//        char[] arr = s.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 'd' || arr[i] == 'D') {
//                count++;
//            }
//        }
//        return count;
        return s.replaceAll("[^dD]","").length();
    }
}