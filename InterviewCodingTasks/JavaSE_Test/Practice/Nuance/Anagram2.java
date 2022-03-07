package JavaSE_Test.Practice.Nuance;

/*
Write a function that given two string inputs,
return true if both strings are anagrams of each
other and false otherwise
Example:
e.g. "rescue" and "secure" are anagrams of each other
 */

import java.util.*;

public class Anagram2 {

    public static String CharWithFrequency(String str){

        String nonDuplicateString="";
        String wordsWithFrequency="";

        for (int i = 0; i < str.length(); i++){
            if(!nonDuplicateString.contains(str.substring(i,i+1))) {
                nonDuplicateString += str.substring(i,i+1);
            }
        }

        Set<String> nonDupleCharSet=new TreeSet<>();
        for (int i = 0; i < nonDuplicateString.length(); i++) {
            nonDupleCharSet.add(nonDuplicateString.substring(i,i+1));
        }

        //System.out.println("nonDuplicateString = " + nonDuplicateString); // rescu
        //System.out.println("nonDupleCharSet = " + nonDupleCharSet);

        for (int i = 0; i <nonDupleCharSet.size() ; i++) {

            List<String> stringsList = new ArrayList<>(nonDupleCharSet);

            String temp=stringsList.get(i);
            int[] count=new int[stringsList.size()];
            for (int j = 0; j < str.length(); j++) {

                if(temp.equals(str.substring(j,j+1))){
                    count[i]+=1;
                }else {
                    count[i]+=0;
                }
            }
            //System.out.println("count[i] = " + count[i]);
            wordsWithFrequency+=temp+count[i];

        }

        return wordsWithFrequency;
    }

    public static boolean anagram(String str1, String str2){
        return CharWithFrequency(str1).equals(CharWithFrequency(str2));
    }

    public static void main(String[] args) {

        String str1="rescue";
        String str2="secure";

        String str3="aab";
        String str4="abb";

        System.out.println("CharWithFrequency(str1) = " + CharWithFrequency(str1));
        System.out.println("CharWithFrequency(str2) = " + CharWithFrequency(str2));
        System.out.println("anagram(str1,str2) = " + anagram(str1, str2));

        System.out.println("\"==================\" = " + "==================");

        System.out.println("CharWithFrequency(str1) = " + CharWithFrequency(str3));
        System.out.println("CharWithFrequency(str2) = " + CharWithFrequency(str4));
        System.out.println("anagram(str3,str4) = " + anagram(str3, str4));


    }

}
