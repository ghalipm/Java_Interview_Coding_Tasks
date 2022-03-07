package JavaSE_Test.Practice.GeeksForGeeks;

import java.util.Arrays;
import java.util.List;

/**
 * Amazon interview question: Jamila
 */

public class CountGroups {
    // "110", "110", "001": N=3
    public static int countGroups(List<String> related){
        //write your code here
        int numberOfGroups=0;
        int N=related.size();// this is the max number of books
        // a subscriber can gift a book from his/her library: there are N people
        // so we deal with (N)x(N) matrix; so the string length must be also N.
        // i gives a book to j:  ---> M[i][j]=1;
        // i does not give a book to j ---> M[i][j]=0
        // M[i][i]=1
        for (int i = 0; i <N; i++) { // row
            for (int j = 0; j <N; j++) { // column
                if(i!=j && related.get(i).substring(j,j+1).equals("1")){
                    numberOfGroups++;
                }

            }
        }
        return numberOfGroups;
    }

    public static void main(String[] args) {

        List<String> rows= Arrays.asList(new String[]{"110", "110", "001"});
        //List<String> rows= Arrays.asList(new String[]{"1000", "0110", "0110","0001"});
        System.out.println("countGroups(rows) = " + countGroups(rows));

    }
}

