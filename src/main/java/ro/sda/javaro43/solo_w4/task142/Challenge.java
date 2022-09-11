package ro.sda.javaro43.solo_w4.task142;

public class Challenge {

    public static int factorial(int num) {
        return num < 2 ? 1 : num * factorial(num - 1);
    }
}

