package en.codegym.task.jdk13.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Positive and negative numbers
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        int[] numbers = {num1, num2, num3};

        checkNumberSign(numbers);
    }

    private static void checkNumberSign(int[] numbers) {
        int positiveNumbersCounter = 0;
        int negativeNumbersCounter = 0;
        for(int number : numbers) {
            if (number > 0) {
                positiveNumbersCounter++;
            } else if (number < 0) {
                negativeNumbersCounter++;
            }
        }

        System.out.println("Number of negative numbers: " + negativeNumbersCounter);
        System.out.println("Number of positive numbers: " + positiveNumbersCounter);
    }
}

/*
Recommended solution

   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int countPositive = 0;
        int countNegative = 0;
        if (number1 > 0) {
            countPositive++;
        } else if (number1 < 0) {
            countNegative++;
        }
        if (number2 > 0) {
            countPositive++;
        } else if (number2 < 0) {
            countNegative++;
        }
        if (number3 > 0) {
            countPositive++;
        } else if (number3 < 0) {
            countNegative++;
        }
        System.out.println("Number of negative numbers: " + countNegative);
        System.out.println("Number of positive numbers: " + countPositive);
    }
 */
