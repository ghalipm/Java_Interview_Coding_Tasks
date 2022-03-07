package JavaSE_Test.GeeksForGeeks;

/** Square root of a number
 Given an integer x, find the square root of x. If x is not a perfect square, then return floor(√x).

 Example 1:

 Input:
 x = 5
 Output: 2
 Explanation: Since, 5 is not a perfect
 square, floor of square_root of 5 is 2.
 Example 2:

 Input:
 x = 4
 Output: 2
 Explanation: Since, 4 is a perfect
 square, so its square root is 2.

 Your Task:
 You don't need to read input or print anything. The task is to complete the function floorSqrt() which takes x as the input parameter and return its square root.
 Note: Try Solving the question without using sqrt Function.


 */
public class SquareRootProblem {

    /*You are required to complete this function
    */

    static long floorSqrt(long x)
    {
        // Your code here
        long root=0,  solution=0;
        while(x>=root*root){
            solution=root;
            root++;
        }
        return root-1;
    }


    public static void main(String[] args) {
        System.out.println("floorSqrt(37) = " + floorSqrt(37));
        numberSwapper(10,20);

    }

    public static void numberSwapper(int a, int b){
        /**
         * swap 2 numbers without a third variable
         */
        System.out.println("================original pair===========");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a=a+b;//30
        b=a-b;//20
        a=a-b;//10
        System.out.println("================swapped pair===========");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
