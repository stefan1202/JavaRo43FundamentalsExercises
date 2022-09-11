package ro.sda.javaro43.solo_w2.solo_w3.task128;

public class Challenge {
  public static boolean abcmath(int a, int b, int c) {
		int sum = 0;
        for (int i = 0; i<b; i++){
          sum+=a;
          a=sum;
        }
    return sum % c == 0;
  }
}