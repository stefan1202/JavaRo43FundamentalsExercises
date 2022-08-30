package ro.sda.javaro43.solo_w2_co2.task100;

class FindIndex {
    public static int findIndex(String[] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                return i;
            }
        }
        return 0;
    }
}