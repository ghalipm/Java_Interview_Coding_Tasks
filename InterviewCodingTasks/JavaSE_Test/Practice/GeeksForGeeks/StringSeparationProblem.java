package JavaSE_Test.Practice.GeeksForGeeks;

import java.util.Arrays;

public class StringSeparationProblem {

    public static void main(String[] args) {
        String bigString="Serial number|\n" +
                "Company name|\n" +
                "Legal representative|\n" +
                "Registered capital|\n" +
                "Date of establishment|\n" +
                "Contact phone|\n" +
                "Mailbox|\n" +
                "City area|\n" +
                "Affiliated District|\n" +
                "Company Type|\n" +
                "Address|\n" +
                "Business scope|";


        stringSplitting(bigString);
    }

    public static void stringSplitting(String bigString) {
        String[] entryRowCells=new String[12];
        String[] entryRow;
        entryRow=bigString.split("\\|");
        System.out.println("entryRow = " + Arrays.toString(entryRow));

        for (int i = 0; i < 12; i++) {
            entryRowCells[i]=entryRow[i];
            System.out.println("Cell["+(i+1)+"] = " + entryRowCells[i]);

        }

    }



}
