package JavaSE_Test.Practice.GeeksForGeeks;

public class DivisibilityOfArrayByNumber {
    static int[] array={0,3,6,9};

    public static void main(String[] args) {
        System.out.println("isDivisible(array,3) = " + isDivisible(array, 3));
        System.out.println("isDivisible(array,2) = " + isDivisible(array, 2));

    }

    public static boolean isDivisible(int[] arr, int num){
        boolean divisible=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%num!=0){divisible=false; break; }
            else{divisible=true; continue;}
        }
        return divisible;

    }
}
