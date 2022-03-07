package JavaSE_Test.Practice.GeeksForGeeks;

import java.util.Arrays;

public class Coins {
    //There are N coins, each showing either heads or tails.
    //We would like all the coins to form a sequence
    // of alternating heads and tails.
    //  what is the minimum number of coins that must be
    //reserved to achieve this?
    //Assume that N is an integer within the range[1...100]
    //each element of array can have one of the following
    // value:0,1 Write a function:
    //class Solution { public int solution(int[] A); }
    //that, given an array A consisting of N integers representing the coins, returns
    //the minimum number of coins that must be reversed. Consecutive elements
    //bf array A represent consecutive coins and contain either a 0 (heads) or a 1
    //(tails).
    //Examples:
    //1. Given array A = [1,0,1,0, 1, 1], the function should return 1. After reversing
    //the sixth coin, we achieve an alternating sequence of coins (1,0,1,0, 1, 0).
    //2. Given array A = [1,1,0, 1, 1], the function should return 2. After reversing
    //the first and fifth coins, we achieve an alternating sequence (0, 1, 0, 1, 0).
    //3. Given array A = [0, 1, 0], the function should return 0. The sequence of
    //coins is already alternating.
    public static int solution(int[] A) {
        int count = 0;
        boolean found = false;
        for(int i = 0; i < A.length-1; i++) {
            if (A[i] == A[i+1]) {
                System.out.println(A[i] + " " + A[i+1]);
                count++;
            }
            else if (((i + 2) <  A.length-1) && !found) {
                if ((A[i] == 0 && A[i+1] == 1 && A[i+2] == 0) || (A[i] == 1 && A[i+1] == 0 && A[i+2] == 1)) {
                    found = true;
                }
                else if ((A[i] == 1 && A[i+1] == 0 && A[i+2] == 0) || (A[i] == 0 && A[i+1] == 1 && A[i+2] == 1)) {
                    found = true;
                    count = count + 1;
                }
            }

        }
        return count;
    }
    public static void main (String[] args) {
        int[] A = new int[] {1,1,0,1,1,0};
        System.out.println(Arrays.toString(A));
        int count = solution(A);
        System.out.println("Count: " + count);
    }
}