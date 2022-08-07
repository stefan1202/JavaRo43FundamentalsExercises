package ro.sda.javaro43.classstatic;

public class MainVarargs {
    public static void main(String... args) {
        System.out.println("Main with warargs " + args.length + " / " + args);
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
