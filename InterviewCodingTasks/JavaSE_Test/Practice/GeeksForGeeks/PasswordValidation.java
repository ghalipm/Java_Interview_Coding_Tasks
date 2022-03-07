package JavaSE_Test.Practice.GeeksForGeeks;

import sun.security.util.Password;

public class PasswordValidation {

    private static String passWord="aH6m^pox";

    /*
    Java Regular Expression Password Validation
        There may be different requirements for password validation.
        This example covers the most common requirements of them.
        The example requirements are as follows.

        1) Password must contain at least 8 characters
        2) Password must contain at least 1 number
        3) Password must contain at least 1 upper case letter
        4) Password must contain at least 1 lower case letter
        5) Password must contain at least 1 special character
        6) Password must not contain any spaces
      */

    // 1) Password must contain at least n=8 characters
    public static boolean isLong(String str, int n){
        return  str.length()>=n?true:false;
    }

    //2) Password must contain at least 1 number
    public static boolean hasDigit(String str){
        boolean hasDigit=false;
        Character[] chars= new Character[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            chars[i]=str.charAt(i);
            if(Character.isDigit(chars[i])){
                hasDigit=true;
                break;
            }
        }
        return  hasDigit;
    }

    //3) Password must contain at least 1 upper case letter
    public static boolean hasUpperCase(String str){
        boolean hasUC=false;
        Character[] chars= new Character[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            chars[i]=str.charAt(i);
            if(Character.isLetter(chars[i]) && !Character.isLowerCase(chars[i])){
                hasUC=true;
                break;
            }
        }
        return  hasUC;
    }

    //4) Password must contain at least 1 lower case letter
    public static boolean hasLowerCase(String str){
        boolean hasLC=false;
        Character[] chars= new Character[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            chars[i]=str.charAt(i);
            if(Character.isLetter(chars[i]) && Character.isLowerCase(chars[i])){
                hasLC=true;
                break;
            }
        }
        return  hasLC;
    }

    // 5) Password must contain at least 1 special character
    public static boolean hasSpecialChar(String str){
        boolean hasSpecChar=false;
        Character[] chars= new Character[str.length()];
        for (int i = 0; i <str.length() ; i++) {
           chars[i]=str.charAt(i);
           if(!Character.isLetterOrDigit(chars[i])){
               hasSpecChar=true;
               break;
           }
        }
        return  hasSpecChar;
    }

    //6) Password must not contain any spaces
    public static boolean hasWhiteSpace(String str){
        boolean hasWS=false;
        Character[] chars= new Character[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            chars[i]=str.charAt(i);
            if(Character.isWhitespace(chars[i])){
                hasWS=true;
                break;
            }
        }
        return  hasWS;
    }

    public static void main(String[] args) {

        System.out.println(isLong(passWord, 8) && hasSpecialChar(passWord)
                && hasDigit(passWord) && hasUpperCase(passWord)
                && hasLowerCase(passWord) && !hasWhiteSpace(passWord));
    }

}



