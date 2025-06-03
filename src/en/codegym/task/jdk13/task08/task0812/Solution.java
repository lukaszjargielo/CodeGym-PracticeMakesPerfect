package en.codegym.task.jdk13.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest sequence
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        int repsCounter = 1;
        int maxRepsCounter = 1;

        for (int i = 0; i < 9; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                repsCounter++;
                if (repsCounter > maxRepsCounter) {
                    maxRepsCounter = repsCounter;
                }
            } else {
                repsCounter = 1;
            }
        }

        System.out.println(maxRepsCounter);
    }
}

/*
Recommended solution

        int count = 1;
        int max = 1;

        for (int i = 0; i < 9; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                max++;
            } else if (max > count) {
                count = max;
                max = 1;
            } else {
                max = 1;
            }
        }

        if (max > count) {
            count = max;
        }
 */