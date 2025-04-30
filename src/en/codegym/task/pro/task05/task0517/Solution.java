package en.codegym.task.pro.task05.task0517;

import java.util.Arrays;

/* 
Splitting an array
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        int firstHalf = (array.length % 2) == 0 ? array.length / 2 : array.length / 2 + 1;
        int[] ints1 = Arrays.copyOfRange(array, 0, firstHalf);
        result[0] = new int [ints1.length];
        result[0] =  ints1;
        int[] ints2 = Arrays.copyOfRange(array, firstHalf, array.length);
        result[1] = new int [ints2.length];
        result[1] = ints2;
        System.out.println(Arrays.deepToString(result));
    }
}
/*
Recommended solution
int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        result[0] = Arrays.copyOfRange(array, 0, firstPart);
        result[1] = Arrays.copyOfRange(array, firstPart, array.length);
        System.out.println(Arrays.deepToString(result));
 */