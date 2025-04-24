package en.codegym.task.jdk13.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
How to take over the world
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = "%s will take over the world in %d years. Mwa-ha-ha!";
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        System.out.printf(text,name,age);
    }
}
