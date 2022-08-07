package ro.sda.javaro43.seasons;


import java.util.Date;

public class SeasonSwitch {
    public static void main(String[] alaBalaPortocala) {

        Date d = new Date();

        int mounth = d.getMonth();


        switch (mounth) {
            case 2:
            case 3:
            case 4:
                System.out.println("Spring");
                break;

            case 5:
            case 6:
            case 7:
                System.out.println("Summer");
                break;

            case 8:
            case 9:
            case 10:
                System.out.println("Autumn");
                break;

            case 11:
            case 0:
            case 1:
                System.out.println("Winter");
                break;

            default:
                System.out.println("Unknown");
                break;

        }

    }
}
