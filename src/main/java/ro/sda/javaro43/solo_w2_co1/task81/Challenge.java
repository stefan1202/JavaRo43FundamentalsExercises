package ro.sda.javaro43.solo_w2_co1.task81;

public class Challenge {
	public static int countCharacters(String[] arr) {
		int length = 0;
		int sum = 0;
		for (int i = 0; i< arr.length; i++){
			length = arr[i].toCharArray().length;
			sum = sum + length;
		}
		return sum;
	}
}