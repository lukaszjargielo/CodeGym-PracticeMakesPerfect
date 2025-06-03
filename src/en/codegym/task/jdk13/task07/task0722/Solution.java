package en.codegym.task.jdk13.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;

/* 
The end
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        while (true) {
            String input = reader.readLine();
            if(input.equals("end")) {
                break;
            }
            strings.add(input);
        }

        strings.forEach(System.out::println);
    }
}