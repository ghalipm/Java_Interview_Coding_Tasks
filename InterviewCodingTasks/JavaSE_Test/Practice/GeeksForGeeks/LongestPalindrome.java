package JavaSE_Test.Practice.GeeksForGeeks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class String_LongestPalindrome_Alternative {

        // find the longest palindrome in a string:
        // str="  abba racecar     babayega        ana " --> "racecar"

    public static void main(String[] args) {

        // string of words including one or more white space
        String str="  abba racecar     babayega        hello  ";

        // longestPalindrome from the str:
        System.out.println("longestPalindrome = "
                + longestPalindrome(arrayMakerOutOfString(str)));

    }

    // a method to check if a word/string is palindrome
    public  static boolean isPalindrome(String str){
        String reverse="";
        for (int i = str.length()-1; i>=0;  i--) {
            reverse+=str.charAt(i);
        }

        return str.equals(reverse);
    }

    // filter palindrome words and keep the longest palindrome
    public static String longestPalindrome(String[] strArray) {
        List<String> palindromeList = new ArrayList<>();
        String longestPalindrome = "";
        for (int i = 0; i < strArray.length; i++) {
            if (isPalindrome(strArray[i])) {
                palindromeList.add(strArray[i]);
                if (longestPalindrome.length() < strArray[i].length()) {
                    longestPalindrome = strArray[i];
                }
            } else {
                continue;
            }
        }
        System.out.println("palindromesArray = " + palindromeList);
        return longestPalindrome;
    }

    // makes a qualified array for the given String str.
    public static String[] arrayMakerOutOfString(String str){

        System.out.println("Original String = " + str);
        System.out.println("str.length() = " + str.length());
        //trim() removes white space only before the first char and after the last char
        str=str.trim();
        System.out.println("String trimmed = " + str);
        System.out.println("str.length() = " + str.length());
        // remove white space inside the string except it just one white space
        while(str.contains("  ")){
            str=str.replaceFirst("  ", " ");
        }
        // now string has only one white space between two words
        System.out.println("multi-white spaces removed String = " + str);
        System.out.println("str.length() = " + str.length());

        // split the words at white space and make an array
        String[] strArray=str.split(" ");
        System.out.println("array = " + Arrays.toString(strArray));

        return strArray;

    }

}