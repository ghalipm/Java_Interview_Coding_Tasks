package JavaSE_Test.UEN_Practice.RecursiveFunctions;

/**
 * Bakhtiar Semseddin:
 * Write an algorithm to determine if a number n is ‘perfect’.
 * A ‘perfect’ number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Those numbers for which this process ends in 1 are perfect.
 * Return true if n is a perfect number, and false if not.
 *
 *
*/

//My observation:
//int[] attractors={1, 4};
// determines if number n is perfect or not
// If the sum of squares of digits is 1, then it is perfect;
// if the sum of squares of digits is 4, then it is not perfect;
//If the sum of squares of digits is neither 1 nor 4,
// then it should keep calculating using
// the sum of squares of digits as the new input
// until it reaches either 1 or 4.


public class PerfectNumber {

    public static int square_Sum_Of_Digits(int n){
       // System.out.println("original number= " + n);

        int squareSum=0;
    while(n>0){
        squareSum+=(n%10)*(n%10);
        n/=10;
    }
        //System.out.println("squareSum = " + squareSum);
        return squareSum;
    }

    public static boolean isPerfect(int n){
        if(square_Sum_Of_Digits(n)==1){return true;}
        else if(square_Sum_Of_Digits(n)==4){return false;}
        else {return isPerfect(square_Sum_Of_Digits(n));}
    }

    public static boolean isPerfecto(int n){
        return square_Sum_Of_Digits(n) == 1 || (square_Sum_Of_Digits(n) != 4 && isPerfecto(square_Sum_Of_Digits(n)));
    }

    public static void main(String[] args) {
        int n=1000;
        int count=0;

        for (int i = 1; i <=n; i++) {
            if(isPerfecto(i)){
                count++;
                System.out.print(i+", ");
            }else{}
        }

        //System.out.println("isPerfect(n) = " + isPerfect(n));
        System.out.println(" ");
        System.out.println("===============================");
        System.out.println("count = " + count);
    }

}
