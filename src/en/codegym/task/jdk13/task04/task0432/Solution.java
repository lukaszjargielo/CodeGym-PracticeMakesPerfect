package en.codegym.task.jdk13.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
You can't have too much of a good thing
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();
        int number = Integer.parseInt(reader.readLine());

        if(number > 0) {
            while (number > 0) {
                System.out.println(inputString);
                number--;
            }
        }

    }
}
