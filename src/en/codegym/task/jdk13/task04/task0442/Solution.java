package en.codegym.task.jdk13.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Adding
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean stop = false;
        int sum = 0;

        while (!stop) {
            int number = Integer.parseInt(reader.readLine());
            sum += number;
            stop = (number == -1);
        }
        System.out.println(sum);
    }
}
/*
Recommended solution

   int sum = 0;
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            sum += number;

            if (number == -1) {
                break;
            }
        }
        System.out.println(sum);
    }
 */