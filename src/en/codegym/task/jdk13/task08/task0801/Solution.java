package en.codegym.task.jdk13.task08.task0801;

import java.util.HashSet;
import java.util.Set;

/* 
Set of plants
*/

public class Solution {
    public static void main(String[] args) {
        Set<String> plants = new HashSet<>();

        plants.add("watermelon");
        plants.add("banana");
        plants.add("cherry");
        plants.add("pear");
        plants.add("cantaloupe");
        plants.add("blackberry");
        plants.add("ginseng");
        plants.add("strawberry");
        plants.add("iris");
        plants.add("potato");

        for (String plant : plants) {
            System.out.println(plant);
        }


    }
}
