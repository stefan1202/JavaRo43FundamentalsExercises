package ro.sda.javaro43.classstatic;

public class MainClass {
    public static void main(String[] args) {
            MyOuterClass myOuterClass = new MyOuterClass();
            MyOuterClass outerClass= new MyOuterClass();
            MyOuterClass.MyInnerClass myInnerClass1 = myOuterClass.init();
            myInnerClass1.printNumber();    // 5
            MyOuterClass.MyInnerClass myInnerClass2 = myOuterClass.new MyInnerClass();
            myInnerClass2.printNumber();    // 5

        }
}
