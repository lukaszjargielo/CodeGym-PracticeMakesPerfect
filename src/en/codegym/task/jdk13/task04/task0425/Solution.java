package en.codegym.task.jdk13.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Quadrants
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        if(x > 0) {
            if(y > 0) {
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        } else {
            if (y > 0) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }

   /*     Probably better solution - second way
            if(x > 0 && y > 0) {
                System.out.println(1);
            } else if (x > 0 && y < 0) {
                System.out.println(4);
            } else if (x < 0 && y < 0) {
                System.out.println(3);
            } else if (x < 0 && y > 0) {
                System.out.println(2);
            }
            All conditions are visible
            */

    }
}
