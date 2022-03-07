package JavaSE_Test.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Can be written in any language you are comfortable with,
 * please explain your thought process and why you wrote the code the way you did.
 * Given an array of positive integers nums and a positive integer target,
 * return the minimal length of a continuous subarray [numsl, numsl+1, ..., numsr-1, numsr]
 * of which the sum is greater than or equal to target.
 * If there is no such subarray, return 0 instead.
 * Example 1:
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 * Example 2:
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 * Example 3:
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 * Constraints:
 * •	1 <= target <= 109
 * •	1 <= nums.length <= 105
 * •	1 <= nums[i] <= 105
 */

public class Target {

    public static int minSubArrayLengthFinder(int target, int[] nums) {
        ArrayList<Integer> subArrayList=new ArrayList<Integer>();
        int sumOfArrayList=0;
        int minSubArrayLength;

        for (int i = 0; i < nums.length; i++) {
        sumOfArrayList+=nums[i];
        }

        // target>sumOfArrayList:
        if(target>sumOfArrayList){
            // no way to sum up the target with the nums array,
            minSubArrayLength=0;

        //target equals to sumOfArrayList
        }else if(target==sumOfArrayList){
            minSubArrayLength= nums.length;

        //target<sumOfArrayList:
        }else{
            for (int i = 0; i < nums.length; i++) {
                // target equals to one element of the nums
                if(target==nums[i]){minSubArrayLength=1; break;}
                // target is greater than one element of the nums
                // while loop should be used below! use a list and do not use index!
                else if(nums[i]<target){
                    for (int j = 0; j < nums.length; j++) {
                        // target-nums[i] equals to one element of the nums
                        if(target-nums[i]==nums[j]){ minSubArrayLength=2;}
                        else{}
                    }
                }else{

                }
            }

        } //case target<sumOfArrayList ends here.
        return 0;
    }

    public static void main(String[] args) {
        //int target = 11;// 8, 7
        //int[] nums ={1,1,1,1,1,1,1,1};// [2,3,1,2,4,3]
        int[] nums ={1,4,7,3,1}; int target=6;

        System.out.println("minSubArrayLengthFinder(target,nums) = " + minSubArrayLengthFinder(target, nums));
    }
}
