package JavaSE_Test.Practice.GeeksForGeeks;

import java.util.Arrays;

/**
 * You are given an array A of integers of length N. You need to calculate factorial of each number. The answer can be very large, so print it modulo 109 + 7.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * A[] = {0, 1, 2, 3, 4}
 * Output:
 * 1 1 2 6 24
 * Explanation:
 * Factorial of 0 is 1,
 * factorial of 1 is 1, factorial of 2 is 2,
 * factorial of 3 is 6 and so on.
 *
 * Example 2:
 *
 * Input:
 * N = 3
 * A[] = {5, 6, 3}
 * Output:
 * 120 720 6
 * Explanation:
 * Factorial of 5 is 120,
 * factorial of 6 is 720,
 * factorial of 3 is 6.
 *
 * Your Task:
 * Complete the function factorial() which takes list a and single integer n,
 * as input parameters and returns a list of factorials of the numbers in the list a.
 */

public class Factorial {

    public static long[] factorial(long a[], int n) {
        // code here
        long[] factorials=new long[a.length];

        for (int i = 0; i < a.length; i++) {
            long temp=1;
            factorials[i]=1;
            while (a[i] > 1) {
                    factorials[i] *= a[i]--;
            }
        }

        return factorials;
    }

    public static void main(String[] args) {
        long[] array={3,4,5};
        System.out.println("factorial([3, 4, 5], 3) = " + Arrays.toString(factorial(array,3)));
    }

}
