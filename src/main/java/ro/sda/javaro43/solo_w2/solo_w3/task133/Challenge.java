package ro.sda.javaro43.solo_w2.solo_w3.task133;

public class Challenge {
	public static String hackerSpeak(String str) {
		return str.replaceAll("a","4")
				.replaceAll("e","3")
				.replaceAll("i","1")
				.replaceAll("o","0")
				.replaceAll("s","5");
	}
}