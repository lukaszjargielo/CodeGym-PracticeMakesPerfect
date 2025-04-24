package en.codegym.task.jdk13.task04.task0408;

/* 
Good or bad?
*/

public class Solution {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        String text = "The number is %s than 5\n";
        String less = "less";
        String equalOrGrater = "equal or greater";

        if(a < 5) {
            System.out.printf(text, less);
        } else {
            System.out.printf(text, equalOrGrater);
        }

    }
}