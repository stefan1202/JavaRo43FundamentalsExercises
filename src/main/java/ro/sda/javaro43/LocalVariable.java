package ro.sda.javaro43;

public class LocalVariable {
    private static Integer wrapperVariable;

    public static void main(String[] args) {
        System.out.println(wrapperVariable);

        for (int i = 0; i < 10; ) {
            wrapperVariable = Integer.parseInt(i + "");
            System.out.println(wrapperVariable);
            i = i + 3;
        }
        int i = 4;
        long d = 5l;
        int result = (int) (i + d);

        float temperature = 36.4f;
        if (temperature >= 37.0f) {
            System.out.println("You have a fever!");
        } else if (temperature >= 36.6f && temperature < 37.0f) {
            System.out.println("You are healthy!");
        } else {
            System.out.println("You are weakened!");
        }
        switchExemple(5);
        switchExemple(1);
    }

    public static void switchExemple(int i) {
        switch (i) {
            case 1:
                System.out.println(1);
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(4);
                break;
            // other cases
            default:
                System.out.println("Default");
                break;
        }
    }
}
