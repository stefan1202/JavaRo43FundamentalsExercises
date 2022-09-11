package ro.sda.javaro43.solo_w4.task137;

public class Challenge {

    public static int squareAreasDifference(int r) {
        int circleDiameter = r + r;
        int firstSquareArea = circleDiameter * circleDiameter / 2;
        int secondSquareArea = circleDiameter * circleDiameter;
        return secondSquareArea - firstSquareArea;
    }

}

