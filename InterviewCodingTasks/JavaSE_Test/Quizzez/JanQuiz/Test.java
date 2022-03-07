package JavaSE_Test.Quizzez.JanQuiz;
//Q46
public class Test {
    public static void main(String[] args) {

    }
}

interface  Run{
    default void walk(){
        System.out.println( "Walking and running");
    }
}

interface  Jog{
    default void walk(){
        System.out.println( "Walking and jogging");
    }
}

class Sprint implements Run, Jog{
    @Override
    public void walk(){ // is ok
    //void walk(){ // error
        System.out.println("Sprinting");
    }
}
