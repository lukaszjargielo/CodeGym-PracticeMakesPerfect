package en.codegym.task.jdk13.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Positive number
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int fistInputNumber = Integer.parseInt(reader.readLine());
        int secondInputNumber = Integer.parseInt(reader.readLine());
        int thirdInputNumber = Integer.parseInt(reader.readLine());

        int[] numbers = {fistInputNumber, secondInputNumber, thirdInputNumber};

        System.out.println(countPositiveNumbers(numbers));

    }

    private static int countPositiveNumbers(int[] numbers) {
        int counter = 0;
        for (int number : numbers) {
            if (number > 0) {
                counter++;
            }
        }
        return counter;
    }
}

/*
Recommended solution

 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int counter = 0;
        if (number1 > 0) {
            counter++;
        }
        if (number2 > 0) {
            counter++;
        }
        if (number3 > 0) {
            counter++;
        }
        System.out.println(counter);
    }
 */