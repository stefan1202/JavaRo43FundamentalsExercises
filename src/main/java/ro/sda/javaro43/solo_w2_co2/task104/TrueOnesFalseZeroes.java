package ro.sda.javaro43.solo_w2_co2.task104;

public class TrueOnesFalseZeroes {
    public static boolean[] integerBoolean(String bits) {
        boolean[] arr = new boolean[bits.length()];

        for (int i = 0; i < bits.length(); i++) {
            switch (bits.charAt(i)) {
                case '1':
                    arr[i] = true;
                    break;
                case '0':
                    arr[i] = false;
                    break;
            }
        }
        return arr;
    }
}