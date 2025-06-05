package en.codegym.task.jdk13.task08.task0817;

import java.util.*;

/* 
We don't need repeats
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> surnamesAndNames = new HashMap<>(Map.of(
                "Smith", "James",
                "Johnson", "Emily",
                "Brown", "David",
                "Davis", "Sarah",
                "Miller", "William",
                "Wilson", "Jessica",
                "Moore", "David",
                "Taylor", "Emma",
                "Anderson", "John",
                "Thomas", "Olivia"));

        return surnamesAndNames;

    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        List<String> duplicates = new ArrayList<>();
        Collection<String> values = map.values();
        for(String value : values) {
            int counter = 0;
            for(String name : values) {
                if (value.equals(name)) {
                    counter++;
                    if (counter > 1) {
                        duplicates.add(value);
                    }
                }
            }
        }
        for (String duplicate : duplicates) {
            removeItemFromMapByValue(map, duplicate);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        /*Map<String, String> map = createMap();
        removeFirstNameDuplicates(map);
        System.out.println(map.toString());*/
    }
}

/*
Recommended solution

public static void removeFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);

        for (String name : copy.values()) {
            int count = 0;
            for (String nameTmp : map.values()) {
                if (nameTmp.equals(name)) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, name);
            }
        }
    }
 */