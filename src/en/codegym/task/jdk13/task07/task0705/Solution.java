package en.codegym.task.jdk13.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] largeArray = new int[20];
        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];

        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0, j = 0; i < largeArray.length; i++) {
            if (i < 10) {
                smallArray1[i] = largeArray[i];
            } else {
                smallArray2[j] = largeArray[i];
                j++;
            }
        }

        for (var value : smallArray2) {
            System.out.println(value);
        }
    }
}
/*
Recommended solution
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = array[i];
            array2[i] = array[i + 10];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(array2[i]);
        }
    }
 */
