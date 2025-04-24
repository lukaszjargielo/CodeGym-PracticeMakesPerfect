package en.codegym.task.jdk13.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Minimum of two numbers
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        int minNumber = num1 < num2 ? num1 : num2;
        System.out.println(minNumber);

    }
}