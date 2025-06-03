package en.codegym.task.jdk13.task08.task0802;

import java.util.HashMap;
import java.util.Map;

/* 
Map of 10 pairs
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> kindsOfPlants = new HashMap<>();

        kindsOfPlants.put("watermelon", "melon");
        kindsOfPlants.put("banana", "fruit");
        kindsOfPlants.put("cherry", "fruit");
        kindsOfPlants.put("pear", "fruit");
        kindsOfPlants.put("cantaloupe", "melon");
        kindsOfPlants.put("blackberry", "fruit");
        kindsOfPlants.put("ginseng", "root");
        kindsOfPlants.put("strawberry", "fruit");
        kindsOfPlants.put("iris", "flower");
        kindsOfPlants.put("potato", "tuber");

        for(Map.Entry<String, String> entry : kindsOfPlants.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " - " + value);
        }
    }
}

/*
Recommended solution

for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
 */