package JavaSE_Test.UEN_Practice;

public class Result {
    public static void fizzBuzz(int n){
        // write your code here
        String output="";
        for (int i = 1; i <=n; i++) {
            if(i%3==0&&i%5==0){ output="FizzBuzz";}
            else if(i%3==0&&i%5!=0){output="Fizz";}
            else if(i%5==0&&i%3!=0){output="Buzz";}
            else{output=""+i;}
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        fizzBuzz(1);
        fizzBuzz(2);
        fizzBuzz(3);
        fizzBuzz(5);
        fizzBuzz(15);
    }

}
