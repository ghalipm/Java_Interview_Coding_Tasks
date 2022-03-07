package JavaSE_Test.Practice.RecursiveSequences;

import static java.lang.Math.floor;

public class FibonacciSequence {

        public static void main(String[] args) {
            int n=5;
            if(numberQualified(n)) {
                System.out.println("The " + n + "th term of the Fibonacci sequence :" + fib(n));
                System.out.println("fibRecursive("+n+") = " + fibRecursive(n));
            }else{
                System.out.println("Invalid Input! Index number must be positive integer!");
            }

            // factorial of positive int n:
            if(numberQualified(n)) {
                System.out.println("The factorial of the int "+ n+ " is "+n+"!="  + factorial(n));
            }else{
                System.out.println("Invalid Input! Index number must be positive integer!");
            }

        }


    //Index number must be integer and positive
    public static boolean numberQualified(int n) {
        return (n == floor(n) && n > 0);
    }

        // Fibonacci sequence recursive: f(0)=1,
        //                               f(1)=1,
        //                               f(n)=f(n-1)+f(n-2), n>1;

    /*
        public static int fibRecursive(int num){
            if(num==1 || num==0){ return 1;}
            else{
                return fibRecursive(num-1)+ fibRecursive(num-2);
            }
        }
     */

    public static int fibRecursive(int num){ // left side of the function
        // below we have to return only the right hand side of the function
        return ( num==1 || num==0 )? 1 : fibRecursive(num-1)+ fibRecursive(num-2);
    }

        //regular way of finding Fibonacci sequence:
        public static int fib(int num){
            int x=0;
            int y=1;
            int z=0;
            for (int i = 0; i < num; i++) {
                z = x + y;
                x = y;
                y = z;
            }
            return z;
        }

        // recursive way of finding factorial:
    /*
        public static int factorial(int n){
            if(n==0||n==1) {
                return 1;
            }else{
                return n * factorial(n - 1);
            }
        }

     */

    public static int factorial(int n){
        return (n==0)?1:n * factorial(n - 1);
    }


}
