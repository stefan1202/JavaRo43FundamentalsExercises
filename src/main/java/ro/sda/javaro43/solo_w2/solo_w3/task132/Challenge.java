package ro.sda.javaro43.solo_w2.solo_w3.task132;

import java.util.Arrays;

public class Challenge {
	public static int difference(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length - 1] - nums[0];
	}
}