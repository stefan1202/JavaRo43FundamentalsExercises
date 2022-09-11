package ro.sda.javaro43.solo_w2.solo_w3.task132.task130;

public class Program {
    public static int getAbsSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.abs(nums[i]);
        }
        return sum;
    }
}