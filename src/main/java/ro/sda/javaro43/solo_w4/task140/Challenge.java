package ro.sda.javaro43.solo_w4.task140;

public class Challenge {
	public static int hammingDistance(String str1, String str2) {
		int count = 0;
		for (int i = 0; i < str1.length(); i++){
			if (str1.charAt(i) != str2.charAt(i)){
				count++;
			}
		}
		return count;
	}
}