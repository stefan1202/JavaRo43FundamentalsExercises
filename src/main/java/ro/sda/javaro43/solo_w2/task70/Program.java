package ro.sda.javaro43.solo_w2.task70;

public class Program {
	public static int posCom(int n) {
//		return 1 << n; same result
		return (int) Math.pow(2,n);
	}
}
