package JavaSE_Test.coderbyte;

/**
 * Given two String array with the same length, find the Hamming distance:
 * {"10100", "10011"} --> 3; {"hello", "hloel"} --> 4.
 */

public class HammingDistance {

    public static int hammingDistance(String[] strArr){
        int distance=0;
        for (int i = 0; i <strArr[0].length() ; i++) {
            if(strArr[0].charAt(i)!=strArr[1].charAt(i)){
                distance++;
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        //String[] strArray={"10100", "10011"};
        String[] strArray={"hellok", "hloekl"};
        System.out.println("hammingDistance(strArray) = " + hammingDistance(strArray));
    }
}
