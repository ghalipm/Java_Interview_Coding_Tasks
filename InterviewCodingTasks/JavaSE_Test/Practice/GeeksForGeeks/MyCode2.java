package JavaSE_Test.Practice.GeeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// determine if an array is balanced: for every number a, there is a number b in the array such that a+b=0 --> balanced
public class MyCode2 {

    public static void main(String[] args) {

        int[] myNum = {1, 2, -1, -4, -2, 4, 0};
        System.out.println(isBalancedArray(myNum));

    }

    //complete the following method
    static boolean isBalancedArray(int[] nums) {
        //toDo
        List<Integer> numList=new ArrayList<Integer>();

        for (int i = 0; i < nums.length ; i++) {
            numList.add(nums[i]);
        }

        boolean isElementBalanced=false;
        int sum = 0;

        for (int k = 0; k < nums.length; k++) {
            sum += nums[k];
        }

        if ( sum != 0) {
            isElementBalanced = false;
        } else {
            while(numList.size()>0) {
                Integer temp= numList.get(0);
                Integer tempNegative=-temp;

                if (numList.contains(-temp)){
                    numList.remove(temp);
                    numList.remove(tempNegative);
                    isElementBalanced=true;
                }else{
                    isElementBalanced=false;
                    break;
                }

            }

        }

        return isElementBalanced;
    }

}
