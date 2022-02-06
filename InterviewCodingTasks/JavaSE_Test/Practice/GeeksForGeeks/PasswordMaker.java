package JavaSE_Test.Practice.GeeksForGeeks;

import java.util.Random;

public class PasswordMaker {
    static String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String digits="0123456789";
    static  String specialChars="@#$^&*!";
    String password="";

    Random random=new Random();

    public static void main(String[] args) {
        System.out.println("Password="+new PasswordMaker().passwordMaker(alphabet,  digits,  specialChars));

    }

    // at least one Capital letter and one small letter and at least a digit must be chosen
    // and passwordLength>=8
    public String passwordMaker(String str1, String str2,  String str3){
            int capLetterIndex1=random.nextInt(str1.length());
            int capLetterIndex2=random.nextInt(str1.length());
            int lowLetterIndex1=random.nextInt(str1.length());
            int lowLetterIndex2=random.nextInt(str1.length());
            int digitIndex1=random.nextInt(str2.length());
            int digitIndex2=random.nextInt(str2.length());
            int specialCharIndex1=random.nextInt(str3.length());
            int specialCharIndex2=random.nextInt(str3.length());
            password+=str1.substring(capLetterIndex1,capLetterIndex1+1 ).toUpperCase()
                    +str1.substring(lowLetterIndex1, lowLetterIndex1+1).toLowerCase()
                    +str1.substring(capLetterIndex2,capLetterIndex2+1 ).toUpperCase()
                    +str1.substring(lowLetterIndex2, lowLetterIndex2+1).toLowerCase()
                    +str2.charAt(digitIndex1)
                    +str3.charAt(specialCharIndex1)
                    +str2.charAt(digitIndex2)
                    +str3.charAt(specialCharIndex2);

        return password;
    }

        }
