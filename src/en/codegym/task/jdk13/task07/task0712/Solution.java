package en.codegym.task.jdk13.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Minimum or maximum
*/

public class Solution {

    public static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        int minLength = strings.get(0).length();
        int maxLength = strings.get(0).length();

        for (var element : strings) {
            if (element.length() < minLength) {
                minLength = element.length();
            }
            if (element.length() > maxLength) {
                maxLength = element.length();
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == minLength || strings.get(i).length() == maxLength) {
                System.out.println(strings.get(i));
                break;
            }
        }
    }
}

/*
Recommended solution

 for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            strings.add(string);
        }

        String minSizeElement = strings.get(0);
        int posMinElement = 0;
        String maxSizeElement = strings.get(0);
        int posMaxElement = 0;
        for (int i = 0; i < 10; i++) {
            if (strings.get(i).length() < minSizeElement.length()) {
                minSizeElement = strings.get(i);
                posMinElement = i;
            } else if (strings.get(i).length() > maxSizeElement.length()) {
                maxSizeElement = strings.get(i);
                posMaxElement = i;
            }
        }

        if (posMinElement < posMaxElement) {
            System.out.println(minSizeElement);
        } else {
            System.out.println(maxSizeElement);
        }
    }
 */