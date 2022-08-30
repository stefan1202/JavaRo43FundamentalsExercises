package ro.sda.javaro43.solo_w3.task112;

public class Challenge {
	public static String howManyTimes(int num) {
		StringBuilder A = new StringBuilder();
		for(int i = 0; i<num; i++){
			A.append("a");
		}
		return "Ed"+A+"bit";
	}
}