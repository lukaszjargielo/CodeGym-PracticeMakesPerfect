package en.codegym.task.jdk13.task02.task0213;

/* 
Every animal should have an owner
*/

public class Solution {
    public static void main(String[] args) {
        Woman woman = new Woman();
        Fish shark = new Fish();
        shark.owner = woman;
        Cat maineCoon = new Cat();
        maineCoon.owner = woman;
        Dog bulldog = new Dog();
        bulldog.owner = woman;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
