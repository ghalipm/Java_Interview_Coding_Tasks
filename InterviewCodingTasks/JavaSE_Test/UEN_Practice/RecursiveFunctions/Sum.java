package JavaSE_Test.UEN_Practice.RecursiveFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {

    // finding the sum of numbers 0, 1, 2, 3,..., n: assuming n is positive int.
    public static Integer sum(int n) {
        return (n==0 || n==1)?n:sum(n-1)+n;
    }

    // finding the sum of integers a_0, a_1, a_2, a_3,..., a_(n-1): assuming n>=1.
    public static Integer sum(List<Integer> list){
        int temp1=0;
        int temp2=0;
        int temp3=0;

        //regular for loop:
        for (int i = 0; i < list.size(); i++) {
            temp1+= list.get(i);
        }

        //enhanced for loop:
        for (Integer listElement : list) {
            temp2 += listElement;
        }

        //stream:
        temp3=list.stream().reduce(0, Integer::sum);

        //while loop:
        int sum=0;
        while(list.size()>0){
            //System.out.println("list = " + list);
            sum+=list.get(0);
            //System.out.println("sum = " + sum);
            list.remove(0);
        }

        // any one of the 4 returns will do the job
        //return temp1;
        //return temp2;
        return temp3;
        //return  sum;
    }

    public static void main(String[] args) {
        Integer[] arr={3,5,7,6,9};
        List<Integer> list=new ArrayList<>(Arrays.asList(arr));

        System.out.println("sum(list) = " + sum(list));

        System.out.println("sum(10) = " + sum(10));
    }

}
