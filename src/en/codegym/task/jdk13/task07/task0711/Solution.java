package en.codegym.task.jdk13.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Remove and insert
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        for (int i = 0; i < 13; i++) {
            String removedString = strings.remove(4);
            strings.add(0, removedString);
        }

        for (var element : strings) {
            System.out.println(element);
        }
    }
}

/*
My solution which is not compiled on the server

   for (int i = 0; i < 13; i++) {
            String removedString = strings.removeFirst();
            strings.addFirst(removedString);
        }

Recommended solution

 for (int i = 0; i < 13; i++) {
            String string = strings.remove(4);
            strings.add(0, string);
        }
 */