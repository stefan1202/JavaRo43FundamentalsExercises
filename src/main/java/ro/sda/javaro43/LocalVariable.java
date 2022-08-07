package ro.sda.javaro43;

public class LocalVariable {
    private static Integer wrapperVariable;
    public static void main(String[] args) {
        System.out.println(wrapperVariable);
        int i=0;
        for (; i<10; ){
            wrapperVariable = Integer.parseInt(i +"");
            System.out.println(wrapperVariable);
            i=i+3;
        }

    }
}
