package JavaSE_Test.UEN_Practice.Stream;

import java.util.ArrayList;

public class IPv4Extractor {

    public static String extract(String input){
        String output="";
        int numOfDots=0;
        int pfws=input.indexOf(" "); //positionOfFirstWhiteSpace
        while (input.contains(".")){numOfDots++;}
        if(numOfDots != 3 ) {output="";}
        else {
            if (Character.isLetter(input.charAt(0))) {
                output = "";
            } else {
                output = input.substring(0, pfws);
            }
        }
        return output;
    }

    public static void main(String[] args) {

        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        c1.add("Pink Light");

        System.out.println("\nOriginal array list: " + c1);
        System.out.println("\nPrint using index of an element: ");
        int no_of_elements = c1.size();
        c1.stream().filter(p->p.startsWith("P")).sorted().forEach(System.out::println);

    }

}
