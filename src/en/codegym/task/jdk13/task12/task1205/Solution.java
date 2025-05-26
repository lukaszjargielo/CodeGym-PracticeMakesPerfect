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
        if (number instanceof Byte) {
            byte result = (byte) number;
            result = (byte) (result / 2);
            return "" + result + "b";
        } else if (number instanceof Integer) {
            int result = number.intValue();
            result = result / 3;
            return "" + result;
        } else if (number instanceof Double) {
            double result = number.doubleValue();
            return result * 20 + "";
        } else {
            return UNEXPECTED_TYPE;
        }
    }
}

/*
Recommended solution

    public static String toCustomString(Number number) {
        if (number instanceof Byte) {
            return (Byte) number / 2 + "b";
        } else if (number instanceof Integer) {
            return String.valueOf((Integer) number / 3);
        } else if (number instanceof Double) {
            return String.valueOf((Double) number * 20);
        } else {
            return UNEXPECTED_TYPE;
        }
    }
 */
