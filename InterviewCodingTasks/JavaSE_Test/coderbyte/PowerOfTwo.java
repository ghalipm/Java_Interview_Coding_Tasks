package JavaSE_Test.coderbyte;

/**
 * for a given integer, return true if the integer is power of two, else return false.
 *  4--> true;
 *  124--> false
 */
public class PowerOfTwo {

    public static boolean powerOfTwo(int num){
        // if num is not divisible by 2, it is not power of 2.
        boolean powerOfTwo=false;
        int original=num;
        int power=0;
        int powerNum=1;
        if(num%2==1){  return false;}
        else{
            while (num%2==0){ num/=2; power++;}
        }

        for (int i = 0; i <power ; i++) {
            powerNum*=2;
        }

        System.out.println("original = " + original);
        System.out.println("powerNum = " + powerNum);
        System.out.println("power = " + power);

        if(original==powerNum){powerOfTwo=true;}

        return powerOfTwo;
    }

    public static void main(String[] args) {
        //System.out.println("powerOfTwo(4) = " + powerOfTwo(4));
        System.out.println("powerOfTwo(124) = " + powerOfTwo(124));
    }

}
