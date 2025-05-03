package en.codegym.task.jdk13.task02.task0204;

/* 
Family relations
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
}
