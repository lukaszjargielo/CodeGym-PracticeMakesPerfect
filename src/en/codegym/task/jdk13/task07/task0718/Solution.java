package en.codegym.task.jdk13.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Checking the order
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        int comparedLength = strings.get(0).length();

        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).length() < comparedLength) {
                System.out.println(i);
                break;
            } else {
                comparedLength = strings.get(i).length();
            }
        }
    }
}

/*
Recommended solution

        String currentString = strings.get(0);

        for (int i = 1; i < 10; i++) {
            if (strings.get(i).length() >= currentString.length()) {
                currentString = strings.get(i);
            } else {
                System.out.println(i);
                break;
            }
        }
    }
 */