
package en.codegym.task.jdk13.task04.task0439;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Chain letter
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        for(int i = 0; i < 10; i++) {
            System.out.println(name + " loves me.");
        }

    }
}
