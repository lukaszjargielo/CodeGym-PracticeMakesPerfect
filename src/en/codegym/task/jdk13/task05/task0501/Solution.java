package en.codegym.task.jdk13.task05.task0501;

/* 
Cat carnage (1)
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Litchi", 4, 8, 6);
        Cat cat2 = new Cat("Mango", 4, 9, 10);
        Cat cat3 = new Cat("Melon", 2, 6, 5);

    }
    public static class Cat {
       private String name;
       private int age;
       private int weight;
       private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
