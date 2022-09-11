package ro.sda.javaro43.solo_w2.solo_w3.task125;

public class Program {
  public static String longBurp(int n) {
    StringBuilder A = new StringBuilder();
    for(int i = 0; i<n; i++){
      A.append("r");
    }
    return "Bu"+A+"p";
  }
}