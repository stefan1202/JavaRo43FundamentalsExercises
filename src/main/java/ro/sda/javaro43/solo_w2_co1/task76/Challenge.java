package ro.sda.javaro43.solo_w2_co1.task76;

public class Challenge {
  public static int calculate(int num1, int num2, String operation) {
    switch(operation){
      case "%":
        return num1 % num2;
      case "+":
        return num1 + num2;
      case "-":
        return num1 - num2;
      case "/":
        return num1 / num2;
      case "*":
        return num1 * num2;
      default:
        return 0;
    }
  }
}