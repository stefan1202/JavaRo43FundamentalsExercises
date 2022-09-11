package ro.sda.javaro43.solo_w2.solo_w3.task134;

public class Challenge {
	public static String formatDate(String date) {
		String[] data = date.split("/");
		return data[2]+data[1]+data[0];
	}
}