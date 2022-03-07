package JavaSE_Test.GeeksForGeeks;
// solved for upto 5 digits: 4 or 5 digits are easy, but not for 6 or more digits
/**
 * Given a palindromic number N in the form of string.
 * The task is to find the smallest palindromic number
 * greater than N using the same set of digits as in N.
 *
 * Example 1:
 *
 * Input:
 * N = "35453"
 * Output:
 * 53435
 * Explanation: Next higher palindromic
 * number is 53435.
 *
 *
 * Example 2:
 *
 * Input: N = "33"
 * Output: -1
 * Explanation: Next higher palindromic number
 * does not exist.
 *
 *
 * Your Task:
 * You don't need to read input or print anything. Your task is to
 * complete the function nextPalin() which takes the string N as
 * input parameters and returns the answer, else if no such
 * number exists returns "-1".
 *
 * Constraints:
 * 1 ≤ |N| ≤ 10^5: should be N<=100_000, practically N<=99_9_99
 * This constraint is misleading: they test your code with 10 digit numbers: input 4697557964
 */

// first half decreasing case has no next Palindrome number.
// For other cases you start from the last digit of the first half string
// and compare the digit to its predecessor until you find a smaller digit,
// then swap the two and do not touch the rest of the first half string.
// then reverse this half to get latter half of the string.

public class NextPalin {

    public static void main(String[] args) {
        System.out.println("nextPalin(\"4697557964\") = " + nextPalin("4697557964"));
        System.out.println("nextPalin(\"35453\") = " + nextPalin("35453"));
    }

    public static String nextPalin(String N)
    {
        //complete the function here
        String nextPalindrome="", firstHalf="", middle="";
        // since N is given as palindromic number,
        // no need to check if N is palindromic


          if(N.length()>=4) {
              firstHalf += N.substring(0, (int)(N.length()/2));
              middle += (N.length()%2==0)?"":N.substring((N.length() - 1)/2, (N.length() - 1)/2 + 1);

              String firstMarker="", wanted="";
              if(sortedDesc(firstHalf)){
                  System.out.println("-1");
              }else{
                  firstMarker+=firstHalf.substring(firstHalf.length()-1);
                  System.out.println("tail(firstMarker)@ = " + firstMarker);
                  for (int i = firstHalf.length()-1; i>=0; i--) {
                      if(Integer.parseInt(firstMarker)<=Integer.parseInt(firstHalf.substring(i,i+1))){
                          firstMarker=firstHalf.substring(i,i+1);
                      }else{
                          // problem here
                          wanted+=firstHalf.charAt(i);
                          System.out.println("firstHalf = " + firstHalf);
                          System.out.println("wanted number=" + wanted+" at index:"+i);

                          nextPalindrome += (i>0 ? firstHalf.substring(0, i):"")
                                  + firstMarker + wanted
                                  +((i + 2)<firstHalf.length()? firstHalf.substring(i + 2):"") ;

                          nextPalindrome+=middle+reverse(nextPalindrome);
                          return nextPalindrome;
                      }
                  }

              }

          }else {
              nextPalindrome="-1";
          }

        return nextPalindrome;
    }

    public static boolean isPalindrome(String str) {
        if (str.equals(reverse(str))) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverse(String str){
        String revString="";
        for (int i = str.length()-1; i >=0; i--) {
            revString+=str.substring(i,i+1);
        }
        return revString;
    }

    public static boolean sortedDesc(String str){
        int temp=Integer.parseInt(str.substring(0,1));
        int count=0;
        boolean isSorted = false;
        for (int i = 0; i < str.length(); i++) {
            if(temp>Integer.parseInt(str.substring(i,i+1))){
                temp=Integer.parseInt(str.substring(i,i+1));
                count++;
            }else {
                isSorted=false;
            }
            if(count==str.length()-1){isSorted=true;}
        }

        return isSorted;
    }


}
