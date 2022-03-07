package JavaSE_Test.Practice.RecursiveSequences;

import java.util.ArrayList;
import java.util.List;

public class SumOfSequence {
    public static void main(String[] args) {

        System.out.println("sum(10) = " + sum(10));

        List<Double> dList = new ArrayList<>();
        dList.add(3.0);
        dList.add(5.0);
        dList.add(7.0);
        dList.add(9.0);
        System.out.println("sum(dList) = " + sum(dList));
    }


    // finding the sum of 1,2,3,...,n:
    public static int sum(int n){
        if(n==1){return 1;}
        else {
            return n + sum(n - 1);
        }
    }

    // finding the sum of numbers a_0, a_1, a_2, a_3,..., a_(n-1): assuming n>=1.
    public static Double sum(List<Double> list){
        Double temp=0.0;
        while (list.size()>=1) {
            temp=list.get(list.size()-1);
            list.remove(temp);
            temp+=sum(list);
        }
        return temp;
    }

}
