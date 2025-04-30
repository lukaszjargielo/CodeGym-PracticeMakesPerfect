package en.codegym.task.pro.task05.task0511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Creating a two-dimensional array
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberR = Integer.parseInt(reader.readLine());
        if(numberR > 0) {
            int i = 0;
            multiArray = new int[numberR][];
            while (i < numberR) {
                int numberC = Integer.parseInt(reader.readLine());
                multiArray[i] = new int[numberC];
                i++;
            }
        }
    }
}

/*
Recommended solution
Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        multiArray = new int[n][];
        for (int i = 0; i < n; i++) {
            int size = Integer.parseInt(scanner.nextLine());
            multiArray[i] = new int[size];
        }
    }
 */
