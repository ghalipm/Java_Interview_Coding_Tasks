package JavaSE_Test.Practice.GeeksForGeeks;

/**
 *  The first few Catalan numbers
 *  for n = 0, 1, 2, 3, … are
 *    C_n = 1, 1, 2, 5, 14, 42, 132,429,...
 *    Another expression:
 *    C_n=(2n,n)/(n+1); (n,r)=n!/(r!(n-r)!)
 *
 *  Test Case 1:
 *
 * Input: n = 4
 * Output: 1, 1, 2, 5, 14
 * Test Case 2:
 *
 * Input: n = 8
 * Output: 1, 1, 2, 5, 14, 42, 132, 429
 *
 */
public class CatalanNumbers {

    public int catalan(int n){
        int catNumber=0;

        for (int i = 0; i <n; i++) {
            catNumber+=catalan(i)*catalan(n-i-1);
        }
                return (n==0)?1:catNumber;
    }

    public static void main(String[] args) {
        CatalanNumbers catalanNumber=new CatalanNumbers();
        int n=5;
        System.out.println("catalanNumber.catalan("+n+") = " + catalanNumber.catalan(n));
    }

}
