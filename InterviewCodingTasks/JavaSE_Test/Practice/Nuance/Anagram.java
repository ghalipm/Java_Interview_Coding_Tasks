package JavaSE_Test.Practice.Nuance;

/*
Write a function that given two string inputs,
return true if both strings are anagrams of each
other and false otherwise
Example:
e.g. "rescue" and "secure" are anagrams of each other
 */

import java.util.ArrayList;
import java.util.List;

public class Anagram {

    public static void main(String[] args) {
        /*
        String str1="rescue";
        String str2="secure";

         */

        String str3="aab";
        String str4="abb";


        boolean isAnagram=false;

        List<Character> charList=new ArrayList<>();
        for (int i = 0; i < str3.length(); i++) {
            charList.add(str3.charAt(i));
        }


        for (int i = 0; i <charList.size() ; i++) {
            if(charList.contains(str4.charAt(i))){
               isAnagram=true;
            }else{
                isAnagram=false;
            }

        }
        System.out.println("the two words are anagram: "+ isAnagram);

    }




}
