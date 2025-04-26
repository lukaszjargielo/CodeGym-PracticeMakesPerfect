package en.codegym.task.jdk13.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Somewhere in the middle
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        int[] numbers = {num1, num2, num3};
        Arrays.sort(numbers);
        System.out.println(numbers[1]);
    }
}

/*
Recommended solution

    if ((number1 >= number2 && number1 <= number3) || (number1 <= number2 && number1 >= number3)) {
            System.out.println(number1);
        } else if ((number2 >= number1 && number2 <= number3) || (number2 <= number1 && number2 >= number3)) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }
 */