package ro.sda.javaro43.solo_w2_co2.task99;

public class Home {
    public static int distanceHome(int[] dist) {
        int sum = 0;
        for (int i = 0; i < dist.length; i++) {
            sum += dist[i];
        }
        return (int) Math.abs(sum);
    }
}