package en.codegym.task.jdk13.task07.task0724;

/* 
Family census
*/

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Human maternalGrandFather = new Human("John", true, 85);
        Human maternalGrandMother = new Human("Kate", false, 75);
        Human paternalGrandFather = new Human("John", true, 60);
        Human paternalGrandMother = new Human("Marie", false, 92);
        Human father = new Human("George", true, 30, paternalGrandFather, paternalGrandMother);
        Human mother = new Human("Donna", false, 30, maternalGrandFather, maternalGrandMother);
        Human child1 = new Human("Lucas", true, 8, father, mother);
        Human child2 = new Human("Anita", false, 5, father, mother);
        Human child3 = new Human("Alice", false, 1, father, mother);

        List<Human> family = Arrays.asList(maternalGrandFather, maternalGrandMother, paternalGrandFather, paternalGrandMother, father, mother, child1, child2, child3);

        family.forEach(System.out::println);

    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null) {
                text += ", father: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", mother: " + this.mother.name;
            }

            return text;
        }
    }
}