package en.codegym.task.jdk13.task05.task0526;

/* 
Man and woman
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Gustavo", 28, "Walker Street 15, Los Angeles");
        Man man2 = new Man("Henry", 56, "North Street 48, Detroit");

        Woman woman1 = new Woman("Helene", 26, "Walker Street 15, Los Angeles");
        Woman woman2 = new Woman("Cindy", 54, "North Street 15, Detroit");

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }
}
