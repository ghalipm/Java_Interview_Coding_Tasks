package JavaSE_Test.Practice.GeeksForGeeks;

/**
 *  The first few Catalan numbers
 *  for n = 0, 1, 2, 3, … are
 *    C_n = 1, 1, 2, 5, 14, 42, 132,429,...
 *    C_n=(2n,n)/(n+1); (n,r)=n!/(r!(n-r)!)
 *
 */

public class CatalanNumbersShort {

    public int factorial(int n){
        return (n==0)?1:(n*factorial(n-1));
    }

    public int catalanWithFactorial(int n){
        return factorial(2*n)/((n+1)*factorial(n)*factorial(n));
    }

    public static void main(String[] args) {
        CatalanNumbersShort catalanNumber=new CatalanNumbersShort();
        int n=5;
        System.out.println("catalanNumber.catalanWithFactorial("+n+") = " + catalanNumber.catalanWithFactorial(n));
    }

}
