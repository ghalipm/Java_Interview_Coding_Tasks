package JavaSE_Test.Practice;

//JavaSETestQ3
abstract class Writer {
    public static void write() {
        System.out.println("Writing...");
    }
}
class Author extends Writer {
    public static void write() {
        System.out.println("Writing book");
    }
}
//public class Programmer extends Writer { // sub class has more stronger access modifier than the parent class.
class Programmer extends Writer {
    public static void write() {
        System.out.println("Writing code");
    }
    public static void main(String[] args) {
        Writer w = new Programmer();
        w.write();
    }
}