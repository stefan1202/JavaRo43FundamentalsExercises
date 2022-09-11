package ro.sda.javaro43.solo_w4.task139;

public class Rhythm {
    public static boolean hasSyncopation(String s) {
//        for (int i = 0; i < arr.length; i++) {
//            if (i % 2 != 0 && s.charAt(i) == '#') {
//                return true;
//            }
//        }
        for (int i = 1; i < s.length(); i += 2) {
            if (s.charAt(i) == '#') {
                return true;
            }
        }
        return false;
    }
}
