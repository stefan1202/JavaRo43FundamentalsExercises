package ro.sda.javaro43.solo_w2.task66;

public class ExperiencePoints {
    public static String getXP(int[] c) {
        int sum = (c[0] * 5) + (c[1] * 10) + (c[2] * 20) + (c[3] * 40) + (c[4] * 80);
        return sum + "XP";
    }
}