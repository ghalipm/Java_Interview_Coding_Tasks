package JavaSE_Test.Practice.LeetCode;

import java.util.Arrays;

/**
 * Problem Statement:
 * Given an array of integers, find two numbers such that they add up to
 * a specific target number.
 * The method twoSum(int[] input, target)should return indices of the
 * two numbers such that they add up to the target, where index1 must be
 * less than index2. Please note that your returned answers
 * (both index1 and index2) are not zero-based.
 *
 * Note: You may assume that each input would have exactly one solution.
 *
 * Example
 * [12,17,21,25], 29 -> [1,2]
 */
public class TwoSum {
    int target;
    public static int[] twoSum(int[] numbers, int target){
        int[] indexArr=new int[2];
        //Arrays.sort(numbers);

        //each numbers would have exactly one solution:
        for (int i = 0; i < numbers.length-1; i++) {
            int firstNum=numbers[i];
            for (int j = i+1; j < numbers.length ; j++) {
                if(numbers[j]==target-firstNum){
                    indexArr[0]=i;
                    indexArr[1]=j;
                    break;
                }
            }

        }

        return indexArr;
    }

    public static void main(String[] args) {
        int[] inputArr={25, 21, 12, 17};
        System.out.println("twoSum({12,17,21,25}, 29) = " + Arrays.toString(twoSum(inputArr, 29)));
    }
}
