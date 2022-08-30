package ro.sda.javaro43.solo_w2_co1.task88;

public class Challenge {
    public static int calcDeterminant(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
}