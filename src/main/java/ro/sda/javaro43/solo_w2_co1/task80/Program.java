package ro.sda.javaro43.solo_w2_co1.task80;

public class Program {
	public static String amazingEdabit(String str) {
			if (str.contains("edabit")){
				return str;
			} else if (str.contains("amazing")) {
				return str.replace("amazing","not amazing");
			}else {
				return null;
			}
	}
}