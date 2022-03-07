package JavaSE_Test.UEN_Practice.RecursiveFunctions;

public class NumTermsMultiNomials {

    public static int F(int n, int k){
        if(n==1||k==0){return 1;}
        else{return F(n-1, k)+F(n, k-1); }
    }

    public static int f(int n, int k){
      return (n==1||k==0)? 1: f(n-1, k)+f(n, k-1);
    }

    public static void main(String[] args) {
        System.out.println("f(4, 2) = " + f(4, 2));
    }

}
