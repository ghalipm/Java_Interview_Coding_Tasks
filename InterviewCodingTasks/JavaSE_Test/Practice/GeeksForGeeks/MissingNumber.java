package JavaSE_Test.Practice.GeeksForGeeks;

import java.util.Arrays;

/**
 * Given an array of size N-1 such that it only contains
 * distinct integers in the range of 1 to N.
 * Find the missing element.
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * A[] = {1,2,3,5}
 * Output: 4
 * Example 2:
 *
 * Input:
 * N = 10
 * A[] = {1,2,3,4,5,6,7,8,10}
 * Output: 9
 *
 * Your Task :
 * You don't need to read input or print anything.
 * Complete the function MissingNumber() that takes
 * array and N as input  parameters and returns
 * the value of the missing number.
 */

public class MissingNumber {
     static int MissingNumber(int array[], int n) {
        // Your Code Here
        Arrays.sort(array);
        int missingNum=0, count=0;
        for (int i = 0; i <n-1; i++) {
            if(array[i]==i+1){count++;}
            else{break;}
        }
        if(count==n-1){missingNum=n;}
        else{missingNum=count+1;}

        return missingNum;
    }

    public static void main(String[] args) {
        /*
        int[] array={2,3, 4, 1, 6,7};
         n=7; // --> 5.
         */
        int[] array={5, 2, 3, 1};
        int n=5; // -->4.

        System.out.println("MissingNumber(array,n) = " + MissingNumber(array, n));

    }

}
