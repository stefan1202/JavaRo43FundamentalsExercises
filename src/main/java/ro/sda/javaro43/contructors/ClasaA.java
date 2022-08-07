package ro.sda.javaro43.contructors;

public class ClasaA {
    int a;

    public ClasaA(int a) {
        this.a = a;
        System.out.println("Construiesc clasa A cu parametru" + a);
    }

    public ClasaA() {
        System.out.println("construim clasa A");
    }
}
