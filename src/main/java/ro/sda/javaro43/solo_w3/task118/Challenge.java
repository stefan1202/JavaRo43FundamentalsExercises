package ro.sda.javaro43.solo_w3.task118;

public class Challenge {
    public static int factorial(int num) {
        int f = 1;
        while (num > 0) {
            f *= num;
            num--;
        }
        return f;
    }
}