package en.codegym.task.jdk13.task09.task0926;

import java.util.ArrayList;
import java.util.Arrays;

/* 
List of number arrays
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> numbers = new ArrayList<>(20);
        int[] array1 = {0,1,2,3,4};
        int[] array2 = {5,6};
        int[] array3 = {7,8,9,10};
        int[] array4 = {11,12,13,14,15,16,17};
        int[] array5 = {};
        numbers.add(array1);
        numbers.add(array2);
        numbers.add(array3);
        numbers.add(array4);
        numbers.add(array5);

        return numbers;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            System.out.println(Arrays.toString(array));
        }
    }
}

/*
Recommended solution

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 2, 3, 4, 5});
        list.add(new int[]{1, 2});
        list.add(new int[]{1, 2, 3, 4});
        list.add(new int[]{1, 2, 3, 4, 5, 6, 7});
        list.add(new int[]{});
        return list;
    }
 */