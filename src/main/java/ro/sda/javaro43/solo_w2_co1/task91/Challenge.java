package ro.sda.javaro43.solo_w2_co1.task91;

public class Challenge {
    public static String missingAngle(int angle1, int angle2) {
        String angle = "";
        if ((180 - angle1 - angle2) < 90) {
            return "acute";
        } else if ((180 - angle1 - angle2) == 90) {
            return "right";
        } else if ((180 - angle1 - angle2) > 90) {
            return "obtuse";
        }
        return null;
    }
}