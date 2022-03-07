package JavaSE_Test.Practice.GeeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** hard problem:
 * https://practice.geeksforgeeks.org/problems/number-of-subsets-with-product-less-than-k
 * Given an array arr[] of N elements.
 * Find the number of subsets whose product
 * of elements is less than or equal to a given integer K.
 *
 * Example 1:
 *
 * Input:
 * N = 4,  arr[] = {2, 4, 5, 3}, K = 12;
 * Output: 8
 * Explanation: All possible subsets whose products are less than 12 are:
 * (2), (4), (5), (3), (2, 4), (2, 5), (2, 3), (4, 3)
 *
 * Example 2:
 * Input:
 * N = 3, arr[] = {9, 8, 3}, K = 2;
 * Output: 0
 * Explanation: There is no subsets with product less than or equal to 2.
 *
 * Constraints:
 * 1 ≤ N ≤ 30
 * 1 ≤ arr[i] ≤ 10
 * 1 ≤ K ≤ 10^6
 *
 * if you succeed, submit your answer to
 */

public class NumberOfSubSets {
  /*
    static int N=4;
    static int K=12;
    static int[] arr={2, 4, 5, 3};

   */

    static int N=3;
    static int K=1;
    static int[] arr={1, 1, 1};

public static int numberOfElementsOfCompleteSet(int n){
    int totalNumber=1;
    for (int i = 0; i < n; i++) {
        totalNumber*=2;
    }
    return totalNumber-1; // empty set is excluded
}


    public static void main(String[] args) {

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        //System.out.println("Arrays.stream(arr).sorted().forEach(System.out::println) :  ");
        //Arrays.stream(arr).sorted().forEach(System.out::println);
        //System.out.println("numOfSubsets(3,2,"+Arrays.toString(arr)+") = " + numOfSubsets(3, 2, arr));
        System.out.println("numOfSubsets(3,1,"+Arrays.toString(arr)+") = " + numOfSubsets(3, 1, arr));
    }

    public static int numOfSubsets(int N, int K, int[] arr){

        //Arrays.sort(arr);
        //System.out.println("sorted array = " + Arrays.toString(arr));
        List<Integer> newGoodList=new ArrayList<Integer>();
        List<Integer> productList=new ArrayList<Integer>();

        Integer toTalProduct=1;

        for (int i = 0; i < N; i++) {
            toTalProduct*=arr[i];
            //System.out.println("array[i] = " + array[i]); // now array is sorted.
            if(arr[i]<=K) {
                newGoodList.add(arr[i]);
            }
            else{
               continue;
            }
        }

        if(toTalProduct<=K){return numberOfElementsOfCompleteSet(N); }
        else {

            // size of singe element list:m
            int m = newGoodList.size();
            int h = productList.size();
            do {
                for (int i = 0; i < newGoodList.size() - 1; i++) {
                    for (int j = i + 1; j < newGoodList.size(); j++) {
                        if (newGoodList.get(i) * newGoodList.get(j) <= K) {
                            productList.add(newGoodList.get(i) * newGoodList.get(j));
                        } else {
                            continue;
                        }
                    }
                }
                if (productList.size() > 0) {
                    newGoodList.addAll(productList);
                    productList.clear();
                } else {
                    break;
                }
            } while (h > 0);
            System.out.println("newGoodList = " + newGoodList);
            return newGoodList.size();

        }
    }


}
