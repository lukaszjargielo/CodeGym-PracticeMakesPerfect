package en.codegym.task.jdk13.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Software update
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> cityAndFamily = new HashMap<>();
        while (true) {
            //System.out.println("Enter the city name:");
            String key = reader.readLine();
            if (key.isEmpty()) {
                break;
            }
            //System.out.println("Enter the last name of family living there:");
            String value = reader.readLine();
            if (value.isEmpty()) {
                break;
            }

            cityAndFamily.put(key, value);
        }

        //System.out.println("What city are you interested in?");
        String city = reader.readLine();

        if (cityAndFamily.containsKey(city)) {
            System.out.println(cityAndFamily.get(city));
        }
    }
}

/*
Recommended solution

Map<String, String> map = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();

            map.put(city, family);
        }

        String city = reader.readLine();

        if (map.containsKey(city)) {
            String familyName = map.get(city);
            System.out.println(familyName);
        }
    }
}

My overly complex program does not pass validation

 Map<String, String> cityAndFamily = new HashMap<>();
        while (true) {
            System.out.println("Enter the city name:");
            String key = reader.readLine();
            if (key.isEmpty()) {
                break;
            }
            System.out.println("Enter the last name of family living there:");
            String value = reader.readLine();
            if (value.isEmpty()) {
                break;
            }

            cityAndFamily.put(key, value);
        }

        System.out.println("What city are you interested in?");
        String city = reader.readLine();

        if (cityAndFamily.containsKey(city)) {
            System.out.println(cityAndFamily.get(city));
        }
    }

 */