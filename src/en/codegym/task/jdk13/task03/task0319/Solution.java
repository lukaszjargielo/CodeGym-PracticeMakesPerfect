package en.codegym.task.jdk13.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Predictions
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = "%s will receive %d in %d years.";

        String name = reader.readLine();
        int salary = Integer.parseInt(reader.readLine());
        int period = Integer.parseInt(reader.readLine());

        System.out.printf(text, name, salary, period);

    }
}
