

package en.codegym.task.jdk13.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();

        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> surnameAndName = new HashMap<>();
        surnameAndName.put("Smith", "James");
        surnameAndName.put("Johnson", "Emily");
        surnameAndName.put("Brown", "David");
        surnameAndName.put("Davis", "Sarah");
        surnameAndName.put("Miller", "William");
        surnameAndName.put("Wilson", "Jessica");
        surnameAndName.put("Moore", "David");
        surnameAndName.put("Miller", "Emma");
        surnameAndName.put("Anderson", "John");
        surnameAndName.put("Thomas", "Olivia");

        return surnameAndName;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

//ATTENTION TRICKY REQUIREMENTS!!!
//We really shall add the same keys!!!

/*
Wrong way

Map<String, String> surnameAndName = new HashMap<>(Map.of(
                "Smith", "James",
                "Johnson", "Emily",
                "Brown", "David",
                "Davis", "Sarah",
                "Miller", "William",
                "Wilson", "Jessica",
                "Moore", "David",
                "Taylor", "Emma",
                "Anderson", "John",
                "Thomas", "Olivia"
        ));
 */