package ro.sda.javaro43.solo_w2.solo_w3.task119;

public class MarketDay {
    public static String whoWinsTonight(int coins, int space, int price, int size) {
        if (coins / price > space / size) {
            return "Bill";
        } else if (coins / price < space / size) {
            return "Will";
        } else {
            return "Tie";
        }
    }
}