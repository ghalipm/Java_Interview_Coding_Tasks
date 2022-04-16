package JavaSE_Test.Tree;

import java.util.Arrays;

/** Roman numbers to Arabic numbers
 * I	i	1
 * V	v	5
 * X	x	10
 * L	l	50
 * C	c	100
 * D	d	500
 * M	m	1,000
 */


public class RomanConverter {
    //static String roman="MMCMXIV"; // 2914
    static String roman="MMMCMXCVII"; // 3997

    public static void main(String[] args) {
        char[] arr=roman.toCharArray();
        int[] nums=new int[arr.length];
        System.out.println("arr = " + Arrays.toString(arr));

        int sum=0;
        for (int i=0; i<arr.length; i++) {
            nums[i]=romanCoverter(arr[i]);
            //System.out.println("nums["+i+"] = " + nums[i]);
        }

        System.out.println("nums = " + Arrays.toString(nums));

        sum+=nums[nums.length-1]; // last element added before adding the others
        System.out.println("sum(before loop)= 0+ nums[" + (nums.length -1) + "] = " + sum);
        for (int i=0; i<nums.length-1; i++){ // nums[nums.length-1] not included!

                if (nums[i] >= nums[i + 1]) {
                    sum += nums[i];
                    System.out.println("nums[" + i + "] = " + nums[i]);
                    System.out.println("sum[" + i + "] = " + sum);
                } else {
                    sum -= nums[i];
                    System.out.println("nums[" + i + "] = " + nums[i]);
                    System.out.println("sum[" + i + "] = " + sum);
                }
            }

        }


    public static int romanCoverter(Character c){
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;

        }

    }

}
