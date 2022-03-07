package JavaSE_Test.Practice.GeeksForGeeks;

/**
 * The sentence "The quick brown fox jumps over the lazy dog" contains
 * every single letter in the alphabet. Such sentences are called pangrams.
 * You are to write a function findMissingLetters, which takes a String,
 * sentence, and returns all the letters it is missing (which prevent it from
 * being a pangram). You should ignore the case of the letters in sentence,
 * and your return should be all lower case letters, in alphabetical order.
 * You should also ignore all non US-ASCII characters.
 *
 * The code you submit must contain a method that conforms to the expected
 * function definition:
 *
 * Java Definition
 * Public Class: PangramDetector
 * Method signature: public String findMissingLetters(String sentence)
 *
 * Examples:
 *
 * (Note that in the examples below, the double quotes should not be
 * considered part of the input or output strings.)
 *
 * 0)  "The quick brown fox jumps over the lazy dog"
 *
 * Returns: ""
 * (This sentence contains every letter)
 *
 * 1)  "The slow purple oryx meanders past the quiescent canine"
 * Returns: "bfgjkvz"
 *
 * 2)  "We hates Bagginses!"
 * Returns: "cdfjklmopqruvxyz"
 *
 * 3)  ""
 * Returns: "abcdefghijklmnopqrstuvwxyz"
 *
 * there were three questions
 * including selenium. I forgot everything in selenium:sweat_smile:
 * except the locators :rofl:
 */

public class FindingMissingChar {

    public static String missingChars(String sentence){
        String missingCharacters="";
        sentence=sentence.toLowerCase();
        for (Character i = 'a'; i <='z'; i++) {
             if(!sentence.contains(""+i)){
                 missingCharacters=missingCharacters+i;
             }else{continue;}
        }
        return missingCharacters;
    }

    public static void main(String[] args) {
        String sentence="The slow purple oryx meanders past the quiescent canine";
        System.out.println("missingChars(sentence) = " + missingChars(sentence));
    }
}
