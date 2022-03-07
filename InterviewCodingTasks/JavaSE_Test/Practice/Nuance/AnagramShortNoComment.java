package JavaSE_Test.Practice.Nuance;

import java.util.Arrays;
// anagram with two methods
public class AnagramShortNoComment {

    public static Character[] stringToCharsSorted(String str){
        Character[] charArr=new Character[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            charArr[i]=str.charAt(i);
        }
        Arrays.sort(charArr);
        return charArr;
    }

    public static boolean isAnagram(String str1, String str2){
        return Arrays.equals(stringToCharsSorted(str1), stringToCharsSorted(str2));
    }

    public static void main(String[] args) {
        String str1="rescue",str2="secure", str3="aab",str4="abb";
        System.out.println(" isAnagram( "+str1+" , "+str2+" ) = " + isAnagram(str1, str2));
        System.out.println(" isAnagram( "+str3+" , "+str4+" ) = " + isAnagram(str3, str4));
    }
}
