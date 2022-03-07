package JavaSE_Test.Practice.GeeksForGeeks;

/**
 * //Write a function solution that returns an arbitrary
 * // integer which is greater than N, not greater
 * // than 1,000,000,000 , and that ends with 0.
 * // You can assume that N is between 1 and 999,999,999.
 * // For example, given N = 27, your function may return 60
 * //and for N = 30, your function may return 40.
 */
public class NumberBetween {

   public static int upperBound=1_000_000_000;
   public static int lowerBound=999_999_999; // 999_999_990, 999_999_999 are border cases.
   //public static int lowerBound=19; // 1, 9, 10, 11, 19 are border cases .

// returns smallest possible integer greater than loweBound smaller than upperBound

    public static int deterministicNumberFinder(){
        // take the tens digit of lowerBound number: lowerBound%10, then increase it by 1 and then multiply it with 10.
        int tensDigit = lowerBound/10;
        System.out.println("tensDigit = " + tensDigit);
        int num=(tensDigit+1)*10;
        return num;
    }

    public static int num=deterministicNumberFinder();
    public static int num3=randomNumberFinder();

    public static int randomNumberFinder(){
        // a number between upper and lower bounds is created,then int num2=(randomNum/10), num2*10.
        int num2=(int)Math.floor(Math.random()*(upperBound-lowerBound+1)+lowerBound)/10;
        int num3=num2*10;
        return num3;
    }


    public static void main(String[] args) {

        if(num<=upperBound && num>lowerBound ) {
            System.out.println("The desired number (deterministic) = " + num);
        }else{
            System.out.println("No such a number exists!");
        }
        System.out.println("============================");
        if(num3<=upperBound && num3>lowerBound ) {
            System.out.println("The desired number (random) = " + num3);
        }else{
            System.out.println("No such a random number exists!");
        }

    }

}
