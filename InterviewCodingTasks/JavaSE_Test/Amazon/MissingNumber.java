package JavaSE_Test.Amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.educative.io/blog/crack-amazon-coding-interview-questions#questions
 */
public class MissingNumber {
    /**
     * 1. Find the missing number in the array
     * You are given an array of positive numbers from 1 to n,
     * such that all numbers from 1 to n are present except one number x.
     * You have to find x. The input array is not sorted.
     * Look at the below array and give it a try before checking the solution.
     *
     * 3,7,1,2,8,4,5
     * n = 8 missing number = 6
     */

    static int find_missing(List<Integer> input) {
        //TODO: Write - Your - Code
        int missingNumber=0;
        int n=input.size()+1;
        List<Integer> fullList=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            fullList.add(i+1);
        }

        for (int j = 0; j < input.size(); j++) {
            fullList.remove(input.get(j));
        }// now only one element is left inside the fullList

        missingNumber=fullList.get(0);
        return missingNumber;
    }

    // The other option: Sum({1,2,...,n}) - Sum({input}) is the missing element.

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(Arrays.asList(3, 6, 1, 2, 8, 4, 5, 9));
        System.out.println("find_missing(list) = " + find_missing(list));
    }

}
