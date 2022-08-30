package ro.sda.javaro43.solo_w2_co1.task83;

public class Program {
    public static boolean check(int[] arr, int el) {
		for (int i = 0; i<arr.length; i++){
            if (arr[i] == el){
                return true;
            }
        }
        return false;
    }
}