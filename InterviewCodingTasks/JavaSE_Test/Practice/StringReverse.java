package JavaSE_Test.Practice;

public class StringReverse {

    public static String frequency(String str){
        String fmtStr="", nonDup="";
        // find non duplicates
        for (int i = 0; i <str.length(); i++) {
            if(!nonDup.contains(""+str.charAt(i))){
            nonDup+=""+str.charAt(i);
            }
        }
        // find out frequency of each char in str
        for (int i = 0; i <nonDup.length(); i++){
            int frequency=0;
            for (int j = 0; j <str.length() ; j++) {
                if(nonDup.charAt(i)==str.charAt(j)){
                    frequency++;
                }
            }
            // nonDup char and its frequency added to the new String
            fmtStr+=""+nonDup.charAt(i)+frequency;

        }
        return fmtStr;
    }

    public static void main(String[] args) {
        System.out.println(frequency("ABHGHDASBDKLAASSS"));
    }
}
