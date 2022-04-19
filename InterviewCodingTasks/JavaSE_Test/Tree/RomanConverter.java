package JavaSE_Test.Tree;

import java.util.Arrays;
import java.util.Map;

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
    //static String roman="MMMDCCCLXXVI"; // 3876
    //static String roman="MMMCDLXVIII"; // 3468
    static String roman="MMMDCXLVIII"; // 3648


    public static void main(String[] args) {
        char[] arr=roman.toCharArray();
        int[] nums=new int[arr.length];
        System.out.println("arr = " + Arrays.toString(arr));

        System.out.println("getRomanInteger3(roman) = " + getRomanInteger3(roman));

        int sum=0;
        for (int i=0; i<arr.length; i++) {
            nums[i]=romanCoverter(arr[i]);
            System.out.println("nums["+i+"] = " + nums[i]);
        }

        System.out.println("nums = " + Arrays.toString(nums));

        sum+=nums[nums.length-1]; // last element added before adding the others
        System.out.println("sum(before loop)= 0+ nums[" + (nums.length -1) + "] = " + sum);

        for (int i=0; i<nums.length-1; i++){ // nums[nums.length-1] not included!

                if (nums[i] >= nums[i + 1]) {
                    sum += nums[i];
                } else {
                    sum -= nums[i];
                }

            System.out.println("nums[" + i + "] = " + nums[i]);
            System.out.println("sum[" + i + "] = " + sum);

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

    //Baha
    public static int romanToInt2(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for(int i = 1;i < s.length(); i ++) {
            int num = getValue(s.charAt(i));
            if(preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }


    public static int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    //Baha
    public static int getRomanInteger2(String roman) {
//assume valid
        Map<Character, Integer> charIntegerMap =
                Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

        int result = charIntegerMap.get(roman.charAt(0));

        for (int i = 1; i < roman.length(); i++) {
            result += charIntegerMap.get(roman.charAt(i));
            int value = charIntegerMap.get(roman.charAt(i));
            int previousValue = charIntegerMap.get(roman.charAt(i - 1));
            if (value > previousValue) { // OPTIMIZE
                result -= previousValue * 2;
            }
        }
        return result;
    }


    //Baha code modified a bit
    public static int getRomanInteger3(String roman) {
//assume valid
        Map<Character, Integer> charIntegerMap =
                Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

        int sum = charIntegerMap.get(roman.charAt(roman.length()-1));

        int current=charIntegerMap.get(roman.charAt(0));
        int next=charIntegerMap.get(roman.charAt(1)); // if current and next placed in the for loop,  2 times O(n) space
        for (int i = 0; i < roman.length()-1; i++) {
            if(current>=next){sum += current;}
            else {sum -= current;}
            current=next;
            if(i<roman.length()-2) {
                next = charIntegerMap.get(roman.charAt(2 + i));
            }else{break;}
        }
        return sum;
    }

}
