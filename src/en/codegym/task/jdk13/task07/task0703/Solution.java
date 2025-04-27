package en.codegym.task.jdk13.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
2 arrays
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = new String[10];
        int[] stringsLength = new int[10];

        for (int i = 0; i < strings.length; i++) {
            String inputString = reader.readLine();
            int inputStringLength = inputString.length();
            strings[i] = inputString;
            stringsLength[i] = inputStringLength;
        }

        for(var value : stringsLength) {
            System.out.println(value);
        }
    }
}

/*
Recommended solution
 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = new String[10];
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            strings[i] = reader.readLine();
            numbers[i] = strings[i].length();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }
 */
