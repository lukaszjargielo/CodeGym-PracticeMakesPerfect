package en.codegym.task.jdk13.task04.task0407;

/* 
Count the number of cats
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        //write your code here

        Cat cat2 = new Cat();
        //write your code here

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}