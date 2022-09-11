package ro.sda.javaro43.solo_w2.solo_w3.task115;

public class Challenge {
	public static String[] addEnding(String[] arr, String ending) {
		String[] endsWith = new String[arr.length];
		for (int i = 0; i< arr.length;i++){
			endsWith[i] = arr[i]+ending;
		}
		return endsWith;
	}
}