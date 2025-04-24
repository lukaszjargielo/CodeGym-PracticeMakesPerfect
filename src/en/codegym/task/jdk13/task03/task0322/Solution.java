package en.codegym.task.jdk13.task03.task0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Deep and pure love
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = "%s + %s + %s = Pure love. Ooo la-la!";

        String firstName = reader.readLine();
        String secondName = reader.readLine();
        String thirdName = reader.readLine();

        System.out.printf(text, firstName, secondName, thirdName);

    }
}