package en.codegym.task.jdk13.task06.task0634;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Chess board
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int chessboardDimension = Integer.parseInt(reader.readLine());

        array = new char[chessboardDimension][chessboardDimension];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i % 2 == 0 && j % 2 == 0) {
                    array[i][j] = '#';
                }else if(i % 2 != 0 && j % 2 != 0) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}

/*
Recommended solution

  Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        array = new char[number][number];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
 */