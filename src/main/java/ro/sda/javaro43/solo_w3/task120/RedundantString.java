package ro.sda.javaro43.solo_w3.task120;

public class RedundantString {
	public static String repeatString(Object t, int n) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n; i++) {
			result.append(t);
		}
		return t instanceof String ? result.toString() : "Not a string!";
	}
}