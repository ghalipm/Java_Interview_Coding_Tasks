package JavaSE_Test.Practice.Assesment;

public class SumOfDigits {


    public static void main(String[] args) {

        int num=375002931;
        int sum=0;
        int currentDigit=0;

        while (num%10>0||num/10>0){
            currentDigit=num%10;
            System.out.println("currentDigit = " + currentDigit);
            sum+=num%10;
            System.out.println("sum = " + sum);
            num=num/10;
            System.out.println("num = " + num);
        }

        System.out.println("sum = " + sum);
    }


}
