package en.codegym.task.jdk13.task04.task0423;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Bouncer policy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        if(age > 20) {
            System.out.println("18 is old enough");
        }

    }
}
