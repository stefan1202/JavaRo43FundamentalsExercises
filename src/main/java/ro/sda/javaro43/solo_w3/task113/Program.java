package ro.sda.javaro43.solo_w3.task113;

public class Program {
    public static String preventDistractions(String args) {
        return args.contains("anime") ||
                args.contains("meme") ||
                args.contains("vines") ||
                args.contains("roasts") ||
                args.contains("Danny DeVito") ? "NO!" : "Safe watching!";
    }
}