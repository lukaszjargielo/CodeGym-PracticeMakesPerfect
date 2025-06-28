package com.codegym.task.task12.task1218;

/* 
Eat, fly, and move

*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanEat, CanMove{
        @Override
        public void eat() {
            System.out.println("Dog is eating.");
        }

        @Override
        public void move() {
            System.out.println("Dog is moving.");
        }
    }

    public class Duck implements CanEat, CanMove, CanFly{

        @Override
        public void eat() {
            System.out.println("Duck is eating.");
        }

        @Override
        public void fly() {
            System.out.println("Duck is flying.");
        }

        @Override
        public void move() {
            System.out.println("Duck is moving.");
        }
    }

    public class Car implements CanMove{
        @Override
        public void move() {
            System.out.println("Car is moving.");
        }
    }

    public class Airplane implements CanFly, CanMove{
        @Override
        public void fly() {
            System.out.println("Airplane is flying.");
        }

        @Override
        public void move() {
            System.out.println("Airplane is moving.");
        }
    }
}
