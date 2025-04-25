package en.codegym.task.jdk13.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Describing numbers
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if (number > 0 && number < 1000) {

            String parity = checkParity(number);
            String numberOfDigits = checkNumberOfDigits(number);

            System.out.println(parity + " " + numberOfDigits);
        }
    }

    private static String checkParity(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    private static String checkNumberOfDigits(int number) {
        if (number < 10) {
            return "single-digit number";
        } else if (number < 100) {
            return "two-digit number";
        } else {
            return "three-digit number";
        }
    }
}

/*First way
      if (number % 2 == 0) {
                if (number < 10) {
                    System.out.println("even single-digit number");
                } else if (number < 100) {
                    System.out.println("even two-digit number");
                } else {
                    System.out.println("even three-digit number");
                }

            } else {
                if (number < 10) {
                    System.out.println("odd single-digit number");
                } else if (number < 100) {
                    System.out.println("odd two-digit number");
                } else {
                    System.out.println("odd three-digit number");
                }
            }

Recommended way

if (number > 0 && number < 10 && number % 2 == 0) {
            System.out.println("even single-digit number");
        } else if (number > 0 && number < 10 && number % 2 != 0) {
            System.out.println("odd single-digit number");
        } else if (number > 9 && number < 100 && number % 2 == 0) {
            System.out.println("even two-digit number");
        } else if (number > 9 && number < 100 && number % 2 != 0) {
            System.out.println("odd two-digit number");
        } else if (number > 99 && number < 1000 && number % 2 == 0) {
            System.out.println("even three-digit number");
        } else if (number > 99 && number < 1000 && number % 2 != 0) {
            System.out.println("odd three-digit number");
        }
 */