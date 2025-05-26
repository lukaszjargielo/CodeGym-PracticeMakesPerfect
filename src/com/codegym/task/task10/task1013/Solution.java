package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String firstName;
        private String lastName;
        private int age;
        private int height;
        private char sex;
        private boolean isOfAge;

        public Human(String firstName, String lastName, int age, int height, char sex, boolean isOfAge) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.height = height;
            this.sex = sex;
            this.isOfAge = isOfAge;
        }

        public Human() {
            this.firstName = "John";
            this.lastName = "Smith";
            this.age = 40;
            this.height = 180;
            this.sex = 'M';
            this.isOfAge = true;

        }

        public Human(String firstName, String lastName, char sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.age = 40;
            this.height = 180;
            this.isOfAge = true;
        }

        public Human(String firstName, String lastName, int age, char sex, boolean isOfAge) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.isOfAge = isOfAge;
            this.height = 180;
        }

        public Human(int height, char sex) {
            this.height = height;
            this.sex = sex;
            this.age = 40;
            this.isOfAge = true;
        }

        public Human(String firstName, String lastName, int height, char sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.height = height;
            this.sex = sex;
            this.age = 40;
            this.isOfAge = true;
        }

        public Human(char sex, int height) {
            this.sex = sex;
            this.height = height;
            this.age = 40;
            this.isOfAge = true;
        }

        public Human(String firstName, char sex) {
            this.firstName = firstName;
            this.sex = sex;
        }

        public Human(char sex, String firstName) {
            this.sex = sex;
            this.firstName = firstName;
        }

        public Human(int height) {
            this.height = height;
        }
    }
}
