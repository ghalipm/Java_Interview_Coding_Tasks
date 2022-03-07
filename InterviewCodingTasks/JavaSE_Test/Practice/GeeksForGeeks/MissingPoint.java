package JavaSE_Test.Practice.GeeksForGeeks;

import java.util.Arrays;

/**
 * Missing Point of a Parallelogram
 * Medium Accuracy: 31.24% Submissions: 1207 Points: 4
 * Given three coordinate points A, B and C, find the missing point D
 * such that ABCD can be a parallelogram. If there are multiple such points,
 * find the lexicographically smallest coordinate.
 *
 * Example 1:
 *
 * Input:
 * A = (3, 2)
 * B = (3, 4)
 * c = (2, 2)
 * Output:
 * 2.000000 0.000000
 * Explanation: There are two options for
 * point D : (2, 4) and (2, 0) such that ABCD
 * forms a parallelogram. Since (2, 0) is
 * lexicographically smaller than (2, 4). Hence,
 * (2, 0) is the answer.
 * Your Task:
 * You don't need to read input or print anything.
 * Your task is to complete the function findPoint()
 * which takes three list of integers A[], B[] and C[]
 * and return D[] list of two numbers with a precision
 * of 6 decimal places where first element of D[ ]
 * denote x coordinate and second element of D[ ] denote y coordinate.
 *
 * Expected Time Complexity: O(1)
 * Expected Auxiliary Space: O(1)
 *
 * Constraints:
 * 1 ≤ x, y ≤ 1000 , where x and y denote coordinates of points A, B and C.
 */

public class MissingPoint {

    public static double[] findPoint (int A[], int B[], int C[])
    {
        // your code here
        double[] D={0,0};
        if(A[0]==B[0]){D[0]=C[0]; D[1]=C[1]-Math.abs(A[1]-B[1]);}
        if(A[0]==C[0]){D[0]=B[0]; D[1]=B[1]-Math.abs(A[1]-C[1]);}
        if(B[0]==C[0]){D[0]=A[0]; D[1]=A[1]-Math.abs(B[1]-C[1]);}


        return D;
    }

    public static void main(String[] args) {
        int[] A={3,2};
        int[] B={2,4};
        int[] C={2,2};
        System.out.println("findPoint(A,B,C) = " + Arrays.toString(findPoint(A, B, C)));
    }

}
