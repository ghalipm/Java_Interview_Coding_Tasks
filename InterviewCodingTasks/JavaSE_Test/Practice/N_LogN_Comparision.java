package JavaSE_Test.Practice;

public class N_LogN_Comparision {
    public static void main(String[] args) {
        int n=100;
        System.out.println( "O(n) operations");
        System.out.println( "Input "+ n+ " and number of operations "+ summingAll(n));
        System.out.println( " ");
        System.out.println( "O(Log(n)) operations");
        System.out.println("Input "+ n+ " and number of operations " + summingBy2Jump(n));

    }
    public static int summingAll(int n){
        int opNum=1;
        for (int i = 1; i<n; i++) {
            opNum+=1; // number of operations
        }
        return opNum;
    }

    public static int summingBy2Jump(int n){
        int opNum=1;
        for (int i = 1; i<n; i*=2) { // i=1 not i=0 !!! (i=0 creates an endless loop! due to i=i*2)
            opNum+=1;// number of operations
        }
        return opNum;
    }
}
