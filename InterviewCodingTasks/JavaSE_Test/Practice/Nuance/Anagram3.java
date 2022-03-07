package JavaSE_Test.Practice.Nuance;

import java.util.*;

public class Anagram3 {

    public static String CharsWithFrequency(String str){
        String wordsWithFrequency="";

        // to get unique chars from the string
        Set<String> nonDuplStringsSet=new TreeSet<>();
        // to get all chars from the string
        List<String> allCharsList=new ArrayList<>();
        // collecting into the set and list
        for (int i = 0; i < str.length(); i++) {
            nonDuplStringsSet.add(str.substring(i,i+1));
            allCharsList.add(str.substring(i,i+1));
        }

        for (String stringChar:nonDuplStringsSet){
            //System.out.println("stringChar = " + stringChar);
            // finding frequency of each char
            wordsWithFrequency+=stringChar+Collections.frequency(allCharsList,stringChar);

        }

        return wordsWithFrequency;
    }

    public static boolean anagram(String str1, String str2){
        System.out.println("CharWithFrequency(str1) = " + CharsWithFrequency(str1));
        System.out.println("CharWithFrequency(str2) = " + CharsWithFrequency(str2));
        return CharsWithFrequency(str1).equals(CharsWithFrequency(str2));
    }

    public static void main(String[] args) {

        String str1="rescue";
        String str2="secure";

        String str3="aab";
        String str4="abb";


        System.out.println("anagram(str1,str2) = " + anagram(str1, str2));

        System.out.println("\"==================\" = " + "==================");

        System.out.println("anagram(str1,str2) = " + anagram(str3, str4));


    }


}
