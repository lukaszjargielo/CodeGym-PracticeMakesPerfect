package en.codegym.task.jdk13.task05.task0525;

/* 
The whole duck isn't enough
*/

public class Solution {
    public static void main(String[] args) {
        Duck duck1 = new en.codegym.task.jdk13.task05.task0525.Solution.Duck();
        Duck duck2 = new en.codegym.task.jdk13.task05.task0525.Solution.Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1);
        System.out.println(dog2);

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1);
        System.out.println(cat2);
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }

    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }
}

