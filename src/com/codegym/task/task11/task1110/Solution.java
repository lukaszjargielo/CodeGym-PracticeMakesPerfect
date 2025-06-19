package com.codegym.task.task11.task1110;

/* 
Don't forget to encapsulate

*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;
        private int speed;

        public Cat(String name, int age, int weight, int speed) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.speed = speed;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }
    }
}
