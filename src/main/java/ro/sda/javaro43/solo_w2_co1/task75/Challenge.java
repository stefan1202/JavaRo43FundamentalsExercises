package ro.sda.javaro43.solo_w2_co1.task75;

public class Challenge {
    public static String helloWorld(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "Hello World";
        } else if (num % 3 == 0) {
            return "Hello";
        } else if (num % 5 == 0){
            return "World";
        }else {
            return null;
        }
    }
}