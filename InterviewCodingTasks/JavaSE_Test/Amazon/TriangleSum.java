package JavaSE_Test.Amazon;
/**
 * 5) Logic and Coding:
 * By starting at the top of the triangle below and moving to adjacent numbers on the row below, the
 * maximum total from top to bottom is 23.
 *       3
 *     7 4
 *   2 4 6
 * 8 5 9 3
 * That is: 3 + 7 + 4 + 9 = 23
 * Write a runnable program that obtains the maximum total for any triangle of that type (the faster it runs
 * the better).
 */

public class TriangleSum {

public int secondLastFilter(int[] arr){
    return (arr.length>1)?arr[arr.length-2]:arr[0];
}

int sumOfTriangle=0;

// level of triangle:
//public  static int levelNum=4;
public  static int levelNum=5;

    public static void main(String[] args) {

        TriangleSum triangleSum=new TriangleSum();

        // triangle as 2D int array:
        //int[][] arr2D= new int[][]{{3}, {7, 4}, {2, 4, 6}, {8, 5, 9, 3}}; //levelNum=4
        int[][] arr2D= new int[][]{{3}, {7, 4}, {2, 4, 6}, {8, 5, 9, 3}, {2, 10, 1, 7, 2}}; //levelNum=5

        for (int i = 0; i < levelNum; i++) {
                triangleSum.sumOfTriangle+= triangleSum.secondLastFilter(arr2D[i]);
        }

        System.out.println("Level Number = " + levelNum);
        System.out.println("Sum of Triangle = " + triangleSum.sumOfTriangle);

    }

}
