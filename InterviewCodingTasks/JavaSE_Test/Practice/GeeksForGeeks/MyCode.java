package JavaSE_Test.Practice.GeeksForGeeks;

import java.io.*;
// determine if an array is balanced: for every number a, there is a number b in the array such that a+b=0 --> balanced
class MyCode {
    public static void main(String[] args) {

        int[] myNum = {1, 2, -1, -4, -2, 4, 0};
        System.out.println(isBalancedArray(myNum));


    }

    //complete the following method

    static boolean isBalancedArray(int[] nums) {
        //toDo
        boolean isElementBalanced=false;
        int sum = 0;

        for (int k = 0; k < nums.length; k++) {
            sum += nums[k];
        }

        if ( sum != 0) {
            isElementBalanced = false;
        } else {
            for (int i = 0; i < nums.length; i++) {
                int temp = nums[i];
                for (int j = 0; j < nums.length; j++) {
                    if (temp == -nums[j]) {
                        isElementBalanced = true;
                        break;
                    } else {
                        isElementBalanced = false;
                    }
                }
            }


        }
        return isElementBalanced;

    }
}
