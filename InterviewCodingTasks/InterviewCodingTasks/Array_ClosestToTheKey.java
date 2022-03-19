package InterviewCodingTasks;

public class Array_ClosestToTheKey {

    public static void main(String[] args) {
        int[] array={1,3,5,9,11};
        int key=12;
        // key=0, nearest=1; correct
        // key=2, nearestSmaller=1; nearestLarger=3 is missing: 3-2=2-1=1: both 1 and 3 have the same distance (1) to 2.
        // key=10, nearestSmaller=9, nearestLarger=11: correct.
        // key=12, nearest=0; wrong!
        printTheClosestElement(array,key);
    }

    /*
    Given sorted array, print the number that’s closest to the key
        Ex:
            Input: (1,3,5,9,11), 6
            Output: 5

            Input: (1,3,5,9,11), 10
            Output: 9 , 11

     */

    public static void printTheClosestElement(int[] array, int key) {
        int nearestSmaller = 0;
        int nearestLarger = 0;

        for (int each : array) {
            if (each <= key) {
                nearestSmaller = each;
            }
            if (each > key) {
                nearestLarger = each;
            }
        }

        int differenceWithSmaller = key - nearestSmaller;
        int differenceWithLarger = nearestLarger - key;

        if (differenceWithSmaller > differenceWithLarger) {
            System.out.println(nearestLarger);
        } else if (differenceWithLarger > differenceWithSmaller) {
            System.out.println(nearestSmaller);
        } else {
            System.out.println(nearestLarger);
            System.out.println(nearestSmaller);
        }

    }


}
