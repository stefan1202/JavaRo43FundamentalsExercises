package ro.sda.javaro43.solo_w2_co1.task72;

public class RgbColor {
    public static int[] invertColor(int[] rgb) {
        int invertA = 255 - rgb[0];
        rgb[0] = invertA;
        int invertB = 255 - rgb[1];
        rgb[1] = invertB;
        int invertC = 255 - rgb[2];
        rgb[2] = invertC;
        return rgb;
    }
}