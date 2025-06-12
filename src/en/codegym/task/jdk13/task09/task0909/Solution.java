package en.codegym.task.jdk13.task09.task0909;

/* 
Exception when working with arrays
*/

public class Solution {

    public static void main(String[] args) {
        try {
            int[] array = new int[2];
            array[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
}
