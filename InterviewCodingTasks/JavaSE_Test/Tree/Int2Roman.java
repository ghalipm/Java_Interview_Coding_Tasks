package JavaSE_Test.Tree;

/**
 * Medium
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given an integer, convert it to a roman numeral.
 *
 * Example 1:
 *
 * Input: num = 3
 * Output: "III"
 * Explanation: 3 is represented as 3 ones.
 * Example 2:
 *
 * Input: num = 58
 * Output: "LVIII"
 * Explanation: L = 50, V = 5, III = 3.
 * Example 3:
 *
 * Input: num = 1994
 * Output: "MCMXCIV"
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *
 *
 * Constraints:
 *
 * 1 <= num <= 3999
 * Accepted: 674,961 Submissions: 1,137,153
 */

public class Int2Roman {

    public static void main(String[] args) {
        //int num=2914; // 2914 --> MMCMXIV
        int num=3997; // 3997 --> MMMCMXCVII
        System.out.println("intToRoman(num) = " + intToRoman(num));
        System.out.println("intToRoman2(num) = " + intToRoman2(num));
    }

    public static StringBuilder intToRoman(int n) {
        StringBuilder roman= new StringBuilder();
        // dealing with 1000 units
        int thousands=n-n%1000;
        while(thousands>0){
            roman.append(intCoverter(thousands));
            thousands=0;
        }
        n=n%1000; // cutting off the 1000 units and looking at 100 units
        // dealing with 100 units
        int hundreds=n-n%100; // tens and units cut off.
        while (hundreds>0){
            roman.append(intCoverter(hundreds));
            hundreds=0;
        }
        n=n%100; // cutting off the 100 units and looking at 10 units
        // dealing with 10 units
        int tens=n- n%10; // units cut off.
        while (tens>0){
            roman.append(intCoverter(tens));
            tens=0;
        }
        n=n%10; // cutting off the 10 units and looking at the units
        // dealing with units
        // units cut off.
        while (n>0){
            roman.append(intCoverter(n));
            n=0;
        }

        return roman;
    }


    public static String intCoverter(Integer num){
        switch (num) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
            case 20:
                return "XX";
            case 30:
                return "XXX";
            case 40:
                return "XL";
            case 50:
                return "L";
            case 60:
                return "LX";
            case 70:
                return "LXX";
            case 80:
                return "LXXX";
            case 90:
                return "XC";
            case 100:
                return "C";
            case 200:
                return "CC";
            case 300:
                return "CCC";
            case 400:
                return "CD";
            case 500:
                return "D";
            case 600:
                return "DC";
            case 700:
                return "DCC";
            case 800:
                return "DCCC";
            case 900:
                return "CM";
            case 1000:
                return "M";
            case 2000:
                return "MM";
            case 3000:
                return "MMM";
            default:
                return " ";

        }

    }

    //*****************************
    public static String intToRoman2(int n) {
        String roman= "";
        // dealing with 1000 units
        int thousands=n-n%1000;
        while(thousands>0){
            roman=roman+""+intCoverter(thousands);
            thousands=0;
        }
        n=n%1000; // cutting off the 1000 units and looking at 100 units
        // dealing with 100 units
        int hundreds=n-n%100; // tens and units cut off.
        while (hundreds>0){
            roman=roman+intCoverter(hundreds);
            hundreds=0;
        }
        n=n%100; // cutting off the 100 units and looking at 10 units
        // dealing with 10 units
        int tens=n- n%10; // units cut off.
        while (tens>0){
            roman=roman+intCoverter(tens);
            tens=0;
        }
        n=n%10; // cutting off the 10 units and looking at the units
        // dealing with units
        // units cut off.
        while (n>0){
            roman=roman+intCoverter(n);
            n=0;
        }

        return roman;
    }


}

/** At LeetCode:
 * Runtime: 5 ms, faster than 89.03% of Java online submissions for Integer to Roman.
 * Memory Usage: 41.7 MB, less than 95.26% of Java online submissions for Integer to Roman.
 */