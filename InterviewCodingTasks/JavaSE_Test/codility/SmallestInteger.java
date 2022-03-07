package JavaSE_Test.codility;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * This is a demo task.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A of N integers, returns the smallest
 * positive integer (greater than 0) that does not occur in A.
 ** For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 ** Given A = [1, 2, 3], the function should return 4.
 ** Given A = [−1, −3], the function should return 1.
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the
 * range [−1,000,000..1,000,000].
 */


class SmallestInteger {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new TreeSet<>();

        for (int a : A) {
            set.add(a);
        }

        int N = set.size();

        int[] C = new int[N];

        int index = 0;

        for (int a : set) {
            C[index++] = a;
        }

        for (int i = 0; i < N; i++) {

            if (C[i] > 0 && C[i] <= N) {
                C[i] = 0;
            }
        }

        for (int i = 0; i < N; i++) {

            if (C[i] != 0) {
                return (i + 1);
            }
        }

        return (N + 1);
    }

    public static int solutionB(int[] arr) {
        int smallestInt = 1;

        if (arr.length == 0) return smallestInt;
        Arrays.sort(arr);

        // min element > 1:
        if (arr[0] > 1) return smallestInt;
        // max element negative:
        if (arr[arr.length - 1] <= 0) return smallestInt;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallestInt) {
                smallestInt++;
            }
        }

        return smallestInt;
    }


    public static void main(String[] args) {
        int[] A={1, 3, 6, 4, 1, 2};
        System.out.println("solution(A) = " + solution(A));
        System.out.println("solutionB(A) = " + solutionB(A));

    }

}
