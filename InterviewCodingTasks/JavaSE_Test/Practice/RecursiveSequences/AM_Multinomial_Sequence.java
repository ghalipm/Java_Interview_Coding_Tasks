package JavaSE_Test.Practice.RecursiveSequences;

import static java.lang.Math.floor;

/**
 * Number of terms in the multinomial (x1+x2+...+xn)^k
 * associated with number of eigenvalues
 */
public class AM_Multinomial_Sequence {

    public static void main(String[] args) {
        int numberOfVariables = 6; // n
        int degree = 9; // k
        if (numbersQualified(numberOfVariables, degree)) {
            System.out.println("Number of terms for "+ numberOfVariables+" variables for the degree "+ degree+" is " + AM_Sequence(numberOfVariables, degree));
            tableMaker(numberOfVariables, degree);
        } else {
            System.out.println("Invalid Input! Number of variables and degree both must be positive integers!");
        }
    }

    //Number of variables and degree both must be positive integers
    public static boolean numbersQualified(int n, int k) {
        return (n == floor(n) && n >= 1 && k >= 0 && k == floor(k));
    }

    /*
    public static int AM_Sequence(int numberOfVariables, int degree) {
        if (numberOfVariables == 1 || degree == 0) {
            return 1;
        } else if (degree == 1) {
            return numberOfVariables;
        } else {
            return AM_Sequence(numberOfVariables - 1, degree)
                    + AM_Sequence(numberOfVariables, degree - 1);
        }
    }
     */

    // ternary form of sequence term generator:
    public static int AM_Sequence(int numberOfVariables, int degree) {
        return  (numberOfVariables == 1 || degree == 0)? 1:(degree == 1)? numberOfVariables:
                AM_Sequence(numberOfVariables - 1, degree)
                + AM_Sequence(numberOfVariables, degree - 1);
    }

    public static void tableMaker(int rowNumber, int columnNumber) {

        for (int col = 0; col <=columnNumber+rowNumber; col++) {
            System.out.print("----");
        }
        System.out.println("");

        System.out.println("n/k:     varNum(n)/degree(k)");

        for (int col = 0; col <=columnNumber+rowNumber; col++) {
            System.out.print("----");
        }

        System.out.println("");
        System.out.print("    ");
        for (int col = 0; col <=columnNumber; col++) {
            System.out.print("     ");
            System.out.print(col);
        }

        System.out.println("");
        String str = "varNumber";

        for (int rows = 0; rows <rowNumber; rows++) {
            while(str.length()<rowNumber){str+=" ";}
            System.out.print("|" + str.charAt(rows) + "| " + (rows +1)+"|");
            System.out.print("   ");
            System.out.print("1");
            for (int col = 0; col <columnNumber; col++) {
                if(AM_Sequence(rows+1, col+1)<10) {
                    System.out.print("     ");
                }else if(AM_Sequence(rows+1, col+1)<100){System.out.print("    "); }
                else if(AM_Sequence(rows+1, col+1)<1000){System.out.print("   "); }
                else if(AM_Sequence(rows+1, col+1)<10000){System.out.print("  "); }
                else if(AM_Sequence(rows+1, col+1)<100000){System.out.print(" "); }
                else{System.out.print(" ");}
                System.out.print(AM_Sequence(rows+1, col+1));
            }
            System.out.println("  ");

        }
    }
}

