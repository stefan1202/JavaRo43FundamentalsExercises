package ro.sda.javaro43.solo_w2.solo_w3.task127;

public class Challenge {
	public static String smallerNum(String n1, String n2) {
		if (Integer.parseInt(n1)<Integer.parseInt(n2)){
			return n1;
		} else if (Integer.parseInt(n1)>Integer.parseInt(n2)) {
			return n2;
		}
		return n1;
	}
}