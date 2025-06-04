package en.codegym.task.jdk13.task08.task0815;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Census
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> surnameAndName = new HashMap<>();

        Map<String, String> source = Map.of(
                "Smith", "James",
                "Johnson", "Emily",
                "Brown", "David",
                "Davis", "Sarah",
                "Miller", "William",
                "Wilson", "Jessica",
                "Moore", "David",
                "Taylor", "Emma",
                "Anderson", "John",
                "Thomas", "Olivia");

        surnameAndName.putAll(source);
        return surnameAndName;
    }

    public static int getSameFirstNameCount(Map<String, String> map, String name) {
        int counter = 0;

        Collection<String> firstNames = map.values();
        for (String firstName : firstNames) {
            if (firstName.equals(name)) {
                counter++;
            }
        }

        return counter;
    }

    public static int getSameLastNameCount(Map<String, String> map, String lastName) {
        int counter = 0;

        Set<String> lastNames = map.keySet();
        for (String surname : lastNames) {
            if (surname.equals(lastName)) {
                counter++;
            }
        }

        return counter;

    }

    public static void main(String[] args) {
       /* Map<String, String> map = createMap();
        System.out.println(getSameFirstNameCount(map, "David"));
        System.out.println(getSameLastNameCount(map, "Miller"));*/
    }
}

/*
Recommended solution

 public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Smith", "Sophia");
        map.put("Johnson", "Isabella");
        map.put("Williams", "Jacob");
        map.put("Brown", "Mason");
        map.put("Jones", "William");
        map.put("Garcia", "Jayden");
        map.put("Miller", "Emily");
        map.put("Davis", "Abigail");
        map.put("Rodriguez", "Mia");
        map.put("Martinez", "Joshua");
        return map;
    }

    public static int getSameFirstNameCount(Map<String, String> map, String name) {
        int count = 0;
        for (String nameTmp : map.values()) {
            if (nameTmp.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getSameLastNameCount(Map<String, String> map, String lastName) {
        int count = 0;
        for (String lastNameTmp : map.keySet()) {
            if (lastNameTmp.equals(lastName)) {
                count++;
            }
        }
        return count;

    }

 */