package JavaSE_Test.UEN_Practice.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamPractice1 {
    public static void main(String[] args) {
        List<Integer> myInts= Arrays.asList(2,4,5,3,1);

        myInts
                .stream()
                .filter(p-> (p>3) ) // keep everything greater than 3
                .sorted()
                .forEach(System.out::println);
        System.out.println("====whatever you did in the stream remains in the stream");
        System.out.println("myInts = " + myInts);

        Integer sum=myInts.stream().reduce(0, (a,b)-> a+b);
        Integer mult=myInts.stream().reduce(1, (a,b)-> a*b);

        System.out.println("sum = " + sum);
        System.out.println("mult = " + mult);
        System.out.println("myInts = " + myInts);
        myInts.stream().filter(p-> p>4).forEach(System.out::println);

        Integer sum1=myInts.stream().reduce(0,Utilities::add);
        System.out.println("sum1 = " + sum1);
        Integer mult1=myInts.stream().reduce(1,Utilities::mult);
        System.out.println("mult1 = " + mult1);

    }

    public static class Utilities{
        public static int add(int a, int b){ return a+b;}
        public static int mult(int a, int b){ return a*b;}
    }

    public class Item{
        int id;
        Integer price;
        public Item(int id){

        }
    }

}
