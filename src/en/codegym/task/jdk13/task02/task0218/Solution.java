package en.codegym.task.jdk13.task02.task0218;

/* 
Repetition is the mother of all learning
*/

public class Solution {
    public static void print3(String text) {
       String string = text + '\n';
        System.out.print(string.repeat(3));

    }

    public static void main(String[] args) {
        print3("I love you!");
    }
}
