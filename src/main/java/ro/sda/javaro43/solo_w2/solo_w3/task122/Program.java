package ro.sda.javaro43.solo_w2.solo_w3.task122;

public class Program {
	public static int factorial(int n) {
		int f = 1;
		while (n > 0) {
			f *= n;
			n--;
		}
		return f;
	}
}