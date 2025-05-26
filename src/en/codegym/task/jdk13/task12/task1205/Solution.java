package en.codegym.task.jdk13.task12.task1205;

/* 
But that's how I want it
*/

public class Solution {

    private static String UNEXPECTED_TYPE = "I didn't expect this type of number!";

    public static void main(String[] args) {
        System.out.println(toCustomString((byte) 12));
        System.out.println(toCustomString(12));
        System.out.println(toCustomString(12.));
        System.out.println(toCustomString(12L));
    }

    public static String toCustomString(Number number) {
        //write your code here

        return null;
    }
}
