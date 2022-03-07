package JavaSE_Test.UEN_Practice.RecursiveFunctions;

/** Fibonacci Numbers/Sequence
 *  f(0)=1, f(1)=1;
 *  f(n)=f(n-1)+f(n-2);

 */
public class FibonacciNumberRecursive {

    public static int fibonacciNumber(int n){
        if(n==0||n==1){
            return 1;
        }else{
            return fibonacciNumber(n-1)+fibonacciNumber(n-2);
        }
    }

    // Fibonacci sequence recursive, ternary:
    public static int fibonacciSequence(int n){
        return (n==0||n==1)?1:
             fibonacciSequence(n-1)+fibonacciSequence(n-2);
    }

    public static void main(String[] args) {
        System.out.println("fibonacciSequence(5) = " + fibonacciSequence(5));
        System.out.println("=====================================");
        System.out.println("fibonacciNumber(5) = " + fibonacciNumber(5));

    }

}
