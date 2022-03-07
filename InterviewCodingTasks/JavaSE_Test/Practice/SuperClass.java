package JavaSE_Test.Practice;

class SuperClass {
    SuperClass(int x) {
        System.out.println("Super");
    }
}

//public class SubClass extends SuperClass {
class SubClass extends SuperClass {
    SubClass() {
        super(10);
        // Line n1
        System.out.println("Sub 2");
    }

}
/*
Which statement, when inserted at Line n1, enables the code to compile?
        A) this(10);
        B) super(10);
        C) SuperClass(10);
        D) super.SuperClass (10);

 */