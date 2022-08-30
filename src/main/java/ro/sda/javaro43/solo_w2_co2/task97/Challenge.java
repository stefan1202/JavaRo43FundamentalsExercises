package ro.sda.javaro43.solo_w2_co2.task97;

public class Challenge {
    public static int sumOfCubes(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum = sum + (int) Math.pow(num, 3);
        }
        return sum;
    }
}