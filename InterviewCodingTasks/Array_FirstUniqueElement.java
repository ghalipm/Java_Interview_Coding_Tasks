public class Array_FirstUniqueElement {

    /*
    write a program that can find the first duplicated element from the array
     */

    public static int firstDuplicatedElement(int[] array) {
        int firstDuplicated = 0;

        for (int each : array) {
            int frequency = 0;
            for (int each2 : array) {
                if (each == each2)
                    frequency++;
            }

            if (frequency > 1) {
                firstDuplicated = each;
                break;
            }

        }

        return firstDuplicated;

    }

    public static void main(String[] args) {
        int[] arr={1,3,5,6,8,3,5,8};
        System.out.println("firstDuplicatedElement(arr) = " + firstDuplicatedElement(arr));




    }

}
