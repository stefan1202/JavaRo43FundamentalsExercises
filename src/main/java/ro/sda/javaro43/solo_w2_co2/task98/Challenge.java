package ro.sda.javaro43.solo_w2_co2.task98;

public class Challenge {
	public static int numberSyllables(String word) {
		return word.replaceAll("[^-]","").length() + 1;
	}
}