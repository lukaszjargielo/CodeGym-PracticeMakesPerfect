package en.codegym.task.jdk13.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Minimum of N numbers
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> list) {
        return Collections.min(list);
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> integers = new ArrayList<>();
        System.out.println("How many numbers do you want to enter?");
        int counter = Integer.parseInt(reader.readLine());
        System.out.println("Enter your numbers:");
        for (int i = 0; i < counter; i++) {
            integers.add(Integer.parseInt(reader.readLine()));
        }
        return integers;
    }
}

/*
Recommended solution

public static int getMinimum(List<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            Integer number = list.get(i);
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }
}
 */