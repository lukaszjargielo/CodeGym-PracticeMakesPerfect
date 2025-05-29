package en.codegym.task.jdk13.task07.task0715;

import java.util.ArrayList;
import java.util.Arrays;

/* 
More Sam-I-Am
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.addAll(Arrays.asList("Sam", "I", "Am"));

        for (int i = 1; i <= strings.size(); i+=2) {
            strings.add(i,"Ham");
        }

        for (var element : strings){
            System.out.println(element);
        }

    }
}

/*
Recommended solution

        ArrayList<String> list = new ArrayList<>();
        list.add("Sam");
        list.add("I");
        list.add("Am");

        list.add(1, "Ham");
        list.add(3, "Ham");
        list.add(5, "Ham");

        for (String string : list) {
            System.out.println(string);
        }
    }
 */