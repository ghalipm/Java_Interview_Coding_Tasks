package JavaSE_Test.Practice.Stream;
/**
 * Stream API:
 * Streams are Monads, thus playing a big part
 * in bringing functional programming to Java:
 *
 * In functional programming, a monad is a structure
 * that represents computations defined as sequences of steps.
 * A type with a monad structure defines what it means to
 * chain operations, or nest functions of that type together.
 */

import java.util.Arrays;
import java.util.List;

public class Practice1 {



    public static void main(String[] args) {
        List<String> myList =
                //Arrays.asList("apple", "action", "banana", "citrus", "celery");
                Arrays.asList("apple", "action", "banana", "citrus", "celery");

        System.out.println("======================regular print=================");
        System.out.println(myList);
        System.out.println("======================sorted print=================");
        //myList.sort(); // does not work.
        System.out.println(myList);

        //
        myList
                .stream()
                .filter(s -> s.startsWith("a")) // filter to keep!
                //.map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
        //System.out.println(myList);
        System.out.println("======================after filter=================");

        myList
                .stream()
                .sorted()
                .forEach(System.out::println);
//
        System.out.println("======================stream  reduce=================");
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = integers.stream()
                //.reduce(0, (a, b) -> a + b);
                .reduce(0, ArithmeticUtils::add); // for addition identity is 0 (zero): a+0=a;
                //.reduce(0, Integer::sum);
        Integer prod = integers.stream()
                //.reduce(1, (a, b) -> a * b);
                .reduce(1, ArithmeticUtils::prod);

        System.out.println("sum = " + sum);
        System.out.println("prod = " + prod);



    }

    public static class ArithmeticUtils {

        public static int add(int a, int b) {
            return a + b;
        }

        public static int prod(int a, int b) {
            return a * b;
        }

    }


}
