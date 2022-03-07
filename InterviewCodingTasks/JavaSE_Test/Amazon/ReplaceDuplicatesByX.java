package JavaSE_Test.Amazon;

import java.util.*;

public class ReplaceDuplicatesByX {
    static Character[] input={'a','b','b','a','c','a'};

    public static List<Character> duplicateReplacedByCharX(Character[] chars) {
        List<Character> outPutChars= new LinkedList<Character>();
        for (int i = 0; i < chars.length; i++) {
            if(!outPutChars.contains(chars[i])){outPutChars.add(chars[i]); }
            else{outPutChars.add('x');}
        }
        return outPutChars;

    }


    public static void main(String[] args) {

        System.out.println("Original input:"+Arrays.toString(input));
        System.out.println("duplicateReplacedByCharX(input) = " + duplicateReplacedByCharX(input));

    }
}
