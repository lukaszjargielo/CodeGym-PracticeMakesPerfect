package en.codegym.task.jdk13.task05.task0527;

/* 
Tom and Jerry
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        Dog spikeDog = new Dog("Spike", 24, true);
        Cat tomCat = new Cat("Tom", true, 'M');
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        private String name;
        private int weight;
        private boolean isFurious;

        public Dog(String name, int weight, boolean isFurious) {
            this.name = name;
            this.weight = weight;
            this.isFurious = isFurious;
        }
    }

    public static class Cat {
        private String name;
        private boolean isHungry;
        private char sex;

        public Cat(String name, boolean isHungry, char sex) {
            this.name = name;
            this.isHungry = isHungry;
            this.sex = sex;
        }
    }
}
