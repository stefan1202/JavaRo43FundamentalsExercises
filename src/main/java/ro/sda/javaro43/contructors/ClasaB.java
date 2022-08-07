package ro.sda.javaro43.contructors;

public class ClasaB extends ClasaA {
    public ClasaB() {
        System.out.println("Construiesc clasa B");
    }

    public ClasaB(int a) {
        super(a);
        System.out.println("Construiesc clasa b cu parametru" + a);
    }

    public ClasaB (double d){
        this();
        System.out.println("Construiesc clasa b cu parametru double" + d);
    }
}
