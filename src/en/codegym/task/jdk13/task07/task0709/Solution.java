package en.codegym.task.jdk13.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        int minLength = strings.get(0).length();

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() < minLength) {
                minLength = strings.get(i).length();
            }
        }

        for (var element : strings) {
            if (element.length() == minLength) {
                System.out.println(element);
            }
        }
    }
}

/*
Recommended solution

 int minStringLength = strings.get(0).length();
        for (String string : strings) {
            if (string.length() < minStringLength) {
                minStringLength = string.length();
            }
        }

        for (String string : strings) {
            if (string.length() == minStringLength) {
                System.out.println(string);
            }
        }
 */
