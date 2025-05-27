package en.codegym.task.jdk13.task07.task0707;

import java.util.ArrayList;
import java.util.Arrays;

/* 
5 different strings in a list
*/

public class Solution {

    public static ArrayList<String> list;

    public static void main(String[] args) {
        list = new ArrayList<String>(Arrays.asList("String1", "String2", "String2", "String4", "String5"));
        System.out.println(list.size());
        for (var element : list) {
            System.out.println(element);
        }
    }
}
