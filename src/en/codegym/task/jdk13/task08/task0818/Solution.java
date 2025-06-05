package en.codegym.task.jdk13.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Only for the rich
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> nameAndSalary = new HashMap<>(Map.of(
                "Taylor", 600,
                "Johnson", 800,
                "Miller", 400,
                "Wilson", 300,
                "Moore", 1000,
                "Anderson", 100,
                "Thomas", 200,
                "Brown", 700,
                "Davis", 800,
                "Smith", 1000
        ));

        return nameAndSalary;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
/*        Map<String, Integer> map = createMap();
        System.out.println(map);
        removeItemFromMap(map);
        System.out.println(map);*/
    }
}
/*
Recommended solution

public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }
*/