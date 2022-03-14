package JavaSE_Test.codility;

import java.util.*;

/**
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

    public static int solutionB(int[] arr) {
        int smallestInt = 1;

        if (arr.length == 0) return smallestInt;
        Arrays.sort(arr); // O(n*log(n) )

        // min element > 1:
        if (arr[0] > 1) return smallestInt;
        // max element negative:
        if (arr[arr.length - 1] <= 0) return smallestInt;

        for (int i = 0; i < arr.length; i++) { //O(n)
            if (arr[i] == smallestInt) {
                smallestInt++;
            }
        }

        return smallestInt;
    }

    public static int solutionC(int[] arr) {
        int smallestInt = 1;
        // for an empty array:
        if (arr.length == 0) return smallestInt;
        // for an array with one element:
        if (arr.length == 1) {
        return  (arr[0]==smallestInt)?++smallestInt:smallestInt;
        }

        int minOfArray=arr[0];
        int maxOfArray=arr[arr.length-1];

        //O(n) finding min and max from array:
        for (int j : arr) {
            if (j <= minOfArray) {
                minOfArray = j;
            } else if (j >= maxOfArray) {
                maxOfArray = j;
            }
        }

        // min element > 1:
        if (minOfArray > 1) return smallestInt;
        // max element negative:
        if (maxOfArray <= 0) return smallestInt;

        List<Integer> list= new ArrayList<>();
       for (int num : arr) list.add(num);  // O(n)

       while (list.contains(smallestInt)) { smallestInt++;} //O(n)

        return smallestInt;
    }

    public static void main(String[] args) {
        int[] A={1};//A={0, 1, 2, 3, 5}; // A={1, 3, 6, 4, 1, 2};
        System.out.println("solutionB(A) = " + solutionB(A));
        System.out.println("solutionC(A) = " + solutionC(A));

    }

}
