package JavaSE_Test.Practice.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyStreamPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,-11));
        System.out.println("list = " + list);

        // double the elements of the list.
        List<Integer> listTimes2 = list.stream().map( a ->  a*2  ).collect(Collectors.toList());
        System.out.println("listTimes2 = " + listTimes2);

        // adding 2 to each element of the list.
        List<Integer> listPlus2 = list.stream().map( a ->  a+2  ).collect(Collectors.toList());
        System.out.println("listPlus2 = " + listPlus2);

        // filtering each element of the list which is greater than 5
        List<Integer> listGreaterThanFive = list.stream().filter(a->a>5).collect(Collectors.toList());
        System.out.println("listGreaterThanFive = " + listGreaterThanFive);

        // summation of elements which is greater than 5
        //Integer listSum = list.stream().filter(a->a>5).reduce(0, (x,y)->x+y);
        Integer listSum = list.stream().reduce(0, Integer::sum);
        System.out.println("listSum = " + listSum);

        // product of elements which is greater than 0
        Integer listProd = list.stream().filter(a->a>0).reduce(1, (x,y)->x*y);
        //Integer listProd = list.stream().reduce(1, (x,y)->x*y);
        System.out.println("listProd = " + listProd);


        System.out.println("----------------------------------------");

        List<String> elements = new ArrayList<>(Arrays.asList("Java", "Java", "C#", "Python", "Python", "Python"));

        List<String> duplicatedElements = new ArrayList<>();

        Predicate<String> isDuplicated = p -> Collections.frequency(elements, p) > 1;

        elements.forEach( s ->{
            if(isDuplicated.test(s))
                if(!duplicatedElements.contains(s))
                    duplicatedElements.add(s);
        } );

        System.out.println(duplicatedElements);


        System.out.println("--------------Descending Order------------------");

        Consumer<String[]> printDescendingOrder = arr -> {
            Arrays.sort(arr);
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        };

        //int[] array = {10, 20, 30, 5, 4, 3, 1, 2, 100, 0};
        String[] array = {"Alma", "Baba", "Cava", "Dada"};
        printDescendingOrder.accept(array);


    }
}
