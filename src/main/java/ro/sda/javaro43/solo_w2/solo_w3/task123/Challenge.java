package ro.sda.javaro43.solo_w2.solo_w3.task123;

public class Challenge {
	public static String removeFirstLast(String str) {
		if (str.length()<=2){
			return str;
		}else {
			return str.substring(1, str.length() - 1);
		}
	}
}