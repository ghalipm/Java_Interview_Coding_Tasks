package JavaSE_Test.Practice.Nuance;

import java.util.Arrays;

public class AnagramShortWithComments {

// get char array for a given string and sort the char array
    public static Character[] stringToCharsSorted(String str){
        Character[] charArr=new Character[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            charArr[i]=str.charAt(i);
        }
        Arrays.sort(charArr);
        //System.out.println("charArr = " + Arrays.toString(charArr));
        return charArr;
    }

    //compare two Arrays. One has to use: Arrays.equals(arr1[], arr2[])
    public static boolean isAnagram(String str1, String str2){
        //System.out.println(" Chars "+ Arrays.toString(stringToCharsSorted(str1)) +" and "+ Arrays.toString(stringToCharsSorted(str2)) +" are same: "+Arrays.equals(stringToCharsSorted(str1), stringToCharsSorted(str2)));
        return Arrays.equals(stringToCharsSorted(str1), stringToCharsSorted(str2));
    }

    public static void main(String[] args) {

        String str1="rescue",str2="secure", str3="aab",str4="abb";

        System.out.println(" isAnagram( "+str1+" , "+str2+" ) = " + isAnagram(str1, str2));
        System.out.println(" isAnagram( "+str3+" , "+str4+" ) = " + isAnagram(str3, str4));


    }
}
