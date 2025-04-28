package en.codegym.task.jdk13.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Street and houses
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] integersArray = new int[15];
        int oddHousesResidents = 0;
        int evenHousesResidents = 0;

        for (int i = 0; i < integersArray.length; i++) {
            integersArray[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0, j = 1; i < integersArray.length - 1 || j < integersArray.length - 1; i += 2, j += 2) {
            evenHousesResidents += integersArray[i];
            oddHousesResidents += integersArray[j];
        }

        if (evenHousesResidents > oddHousesResidents) {
            System.out.println("Even-numbered houses have more residents.");
        } else if (oddHousesResidents > evenHousesResidents) {
            System.out.println("Odd-numbered houses have more residents.");
        }
    }
}
/*
Recommended solution

BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] countResidents = new int[15];
        for (int i = 0; i < 15; i++) {
            countResidents[i] = Integer.parseInt(reader.readLine());
        }

        int even = 0;
        int odd = 0;

        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                even += countResidents[i];
            } else {
                odd += countResidents[i];
            }
        }

        if (even > odd) {
            System.out.println("Even-numbered houses have more residents.");
        } else if (odd > even) {
            System.out.println("Odd-numbered houses have more residents.");
        }
 */
