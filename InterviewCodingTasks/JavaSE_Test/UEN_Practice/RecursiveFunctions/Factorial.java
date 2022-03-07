package JavaSE_Test.UEN_Practice.RecursiveFunctions;

// finding factorial using recursive function

/*
n!=n(n-1)...(2)(1); 1!=1
f(n)=n!
f(n)=n*f(n-1) --> f(1)=1*f(1-1)=1*f(0)=1-->
0!=1
3!=3*2*1=6
 */
public class Factorial {

    public static int f(int n){
        if(n==0){return 1;}
        else{return n*f(n-1);}
    }

    //recursive ternary:
    public static int factorial(int n){
        return (n==0)? 1: n*factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println("factorial(3) = " + factorial(3));
        System.out.println("================");
        System.out.println("f(3) = " + f(3));
    }
}
