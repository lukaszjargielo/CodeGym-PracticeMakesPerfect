package en.codegym.task.jdk13.task09.task0911;

import java.util.HashMap;

/* 
Exception when working with Map collections
*/

public class Solution {

    public static void main(String[] args) {
       try {
           HashMap<String, String> map = new HashMap<>(null);
           System.out.println(map);
       } catch (NullPointerException e) {
           System.out.println(e);
       }
    }
}
