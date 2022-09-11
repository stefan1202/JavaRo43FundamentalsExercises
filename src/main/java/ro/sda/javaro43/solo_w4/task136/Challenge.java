package ro.sda.javaro43.solo_w4.task136;

public class Challenge {

    public static boolean testJackpot(String[] result) {
        if (result[0] == result[1] && result[2] == result[3] && result[0] == result[3]) {
            return true;
        }
        return false;
    }

}

