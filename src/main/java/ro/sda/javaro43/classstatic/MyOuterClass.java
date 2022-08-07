package ro.sda.javaro43.classstatic;

public class MyOuterClass {
    private  int outerNumber = 5;
    public class MyInnerClass {
        public void printNumber() {
            System.out.println(outerNumber);
        }
    }
    public   MyInnerClass init() {
        return new MyInnerClass();  // = this.new MyInnerClass()
    }
}