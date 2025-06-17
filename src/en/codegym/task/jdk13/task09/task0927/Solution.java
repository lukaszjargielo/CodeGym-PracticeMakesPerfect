package en.codegym.task.jdk13.task09.task0927;

import java.util.*;

/* 
Ten cats
*/

public class Solution {

    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> cats = new HashMap<>(Map.of(
                "Litchi", new Cat("Litchi"),
                "Mango", new Cat("Mango"),
                "Kitty", new Cat("Kitty"),
                "Melon", new Cat("Melon"),
                "Klara", new Cat("Klara"),
                "Relaksik", new Cat("Relaksik"),
                "Wandzia", new Cat("Wandzia"),
                "Gienia", new Cat("Gienia"),
                "Moko", new Cat("Moko"),
                "Kicia", new Cat("Kicia")
        ));
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats = new HashSet<>();
        for(Map.Entry<String, Cat> entry : map.entrySet()) {
            cats.add(entry.getValue());
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        public String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Cat)) {
                return false;
            }
            Cat cat = (Cat) o;
            return Objects.equals(name, cat.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}

/*
Recommended solution
public static Map<String, Cat> createMap() {
        HashMap<String, Cat> result = new HashMap<>();

        result.put("Daisy", new Cat("Daisy"));
        result.put("Dakota", new Cat("Dakota"));
        result.put("Abbie", new Cat("Abbie"));
        result.put("Gigi", new Cat("Gigi"));
        result.put("Grace", new Cat("Grace"));
        result.put("Holly", new Cat("Holly"));
        result.put("Tabitha", new Cat("Tabitha"));
        result.put("Roo", new Cat("Roo"));
        result.put("Ruby", new Cat("Ruby"));
        result.put("Lexie", new Cat("Lexie"));

        return result;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        return new HashSet<>(map.values());
    }

 */