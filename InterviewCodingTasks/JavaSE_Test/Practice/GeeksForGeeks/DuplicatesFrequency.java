package JavaSE_Test.Practice.GeeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicatesFrequency {
        public static void main(String[] args) {
            //String words ="java is cool and java is useful";
            String word = "asss dddd f ghhh jj k";
            //output:a1s3 d4 f1 g1h3 j2 k1
            System.out.println("word/char and frequency = " + frequencyOfChars(word));

            System.out.println("frequencyOfWords(\"I like Java, and Java is cool.\") = " + frequencyOfWords("I like Java, and Java is cool."));


        }

        public static String frequencyOfChars(String str) {
            String result = "";
            int k=0;
            while (str.length() > 0) {
                int count = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.substring(i, i + 1).contains(str.substring(0, 1)))
                        count++;
                }
                //if(count=2)
                if (str.charAt(0) != ' ') {
                    if(!result.contains(str.substring(0, 1))){
                    result += str.substring(0, 1) + count;}
                }else{
                    result += " ";

                }
                k+=count;
                //result += str.substring(0, 1);
                str=str.replaceFirst(str.substring(0, 1), "");

            }
            return result;
        }

    public static String frequencyOfWords(String sentence) {
        String result = "";
        sentence=sentence.replaceAll(",", "");
        sentence=sentence.replaceAll("\\.", "");
        String[] words=sentence.split(" ");
        ArrayList<String> wordsList=new ArrayList<>(Arrays.asList(words));
        System.out.println("words = " + Arrays.toString(words));

        for (int i = 0; i < wordsList.size(); i++) {
            System.out.println("wordsList.get("+i+") = " + wordsList.get(i));
        }

        while (wordsList.size() > 0) {
            int count = 0;
            for (int i = 0; i < wordsList.size(); i++) {
                if (wordsList.get(i).contains(wordsList.get(0))) {
                    count++;
                }else{continue;}
            }

            if(!result.contains(wordsList.get(0))){
                    result += " "+wordsList.get(0) +":"+ count;
                }
            else{
                result += "";
            }

            //result += str.substring(0, 1);
           wordsList.remove(wordsList.get(0));

        }
        return result;
    }

    }


