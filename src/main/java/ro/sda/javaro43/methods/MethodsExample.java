package ro.sda.javaro43.methods;

public class MethodsExample {
    public static void main(String[] args) {
        short a=9;
        short b=8;
        short c=1;
        System.out.println(multiple(a,b,c));
    }
    static int  multiple(int arg1, int arg2, int arg3) {
        return arg1 * arg2 * arg3;
    }
}
