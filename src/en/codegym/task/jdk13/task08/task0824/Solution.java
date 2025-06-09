package en.codegym.task.jdk13.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
The whole family together
*/

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human("Lucas", true, 8);
        Human child2 = new Human("Anita", false, 5);
        Human child3 = new Human("Alice", false, 1);
        Human father = new Human("George", true, 27, child1, child2, child3);
        Human mother = new Human("Dana", false, 27, child1, child2, child3);
        Human parentalGrandfather = new Human("John", true, 60, father);
        Human parentalGrandmother = new Human("Marie", false, 55, father);
        Human maternalGrandfather = new Human("John", true, 75, mother);
        Human maternalGrandmother = new Human("Marie", false, 65, mother);


        List<Human> family = new ArrayList<>(List.of(parentalGrandfather, parentalGrandmother,
                maternalGrandfather, maternalGrandmother,
                father, mother,
                child1, child2, child3));

        for (Human familyMember : family) {
            System.out.println(familyMember);
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>(Arrays.asList(children));
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}

/*
Wrong way
Human parentalGrandfather = new Human("John", true, 60, new ArrayList<>(List.of(new Human("George", true, 25, new ArrayList<>(List.of(new Human("Lucas", true, 8, null), new Human("Anita", false, 5, null), new Human("Alice", false, 1, null)))))));

Recommended solution
public class Solution {
    public static void main(String[] args) {
        Human firstChild = new Human("Michael", true, 15);
        Human secondChild = new Human("Liam", false, 10);
        Human thirdChild = new Human("Joseph", true, 5);

        Human father = new Human("David", true, 33, firstChild, secondChild, thirdChild);
        Human mother = new Human("Grace", false, 29, firstChild, secondChild, thirdChild);

        Human paternalGrandfather = new Human("Owen", true, 69, father);
        Human paternalGrandmother = new Human("Gabriel", false, 65, father);

        Human maternalGrandfather = new Human("Nathan", true, 63, mother);
        Human maternalGrandmother = new Human("Hannah", false, 62, mother);


        System.out.println(paternalGrandfather);
        System.out.println(paternalGrandmother);
        System.out.println(maternalGrandfather);
        System.out.println(maternalGrandmother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(firstChild);
        System.out.println(secondChild);
        System.out.println(thirdChild);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;

        List<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;

            Collections.addAll(this.children, children);
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}

In task requirements there was not information about the Human class do not have private modifiers, so my solution is wrong:

public class Solution {
    public static void main(String[] args) {
        Human parentalGrandfather = new Human("John", true, 60, new ArrayList<>());
        Human parentalGrandmother = new Human("Marie", false, 55, new ArrayList<>());
        Human maternalGrandfather = new Human("John", true, 75, new ArrayList<>());
        Human maternalGrandmother = new Human("Marie", false, 65, new ArrayList<>());
        Human father = new Human("George", true, 27, new ArrayList<>());
        Human mother = new Human("Dana", false, 27, new ArrayList<>());
        Human child1 = new Human("Lucas", true, 8, new ArrayList<>());
        Human child2 = new Human("Anita", false, 5, new ArrayList<>());
        Human child3 = new Human("Alice", false, 1, new ArrayList<>());

        parentalGrandfather.setChildren(father);
        parentalGrandmother.setChildren(father);
        maternalGrandfather.setChildren(mother);
        maternalGrandmother.setChildren(mother);
        father.setChildren(child1, child2, child3);
        mother.setChildren(child1, child2, child3);

        List<Human> family = new ArrayList<>(List.of(parentalGrandfather, parentalGrandmother,
                                                        maternalGrandfather, maternalGrandmother,
                                                        father, mother,
                                                        child1, child2, child3));

for (Human familyMember : family) {
    System.out.println(familyMember);
}
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public void setChildren(Human... childrens) {
                        if (childrens.length > 0) {
                for (int i = 0; i < childrens.length; i++) {
                    this.children.add(childrens[i]);
                }
            }
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}


 */
