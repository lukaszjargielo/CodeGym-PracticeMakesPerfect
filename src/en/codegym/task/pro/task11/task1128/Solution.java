package en.codegym.task.pro.task11.task1128;

/* 
Digits as text
*/

public class Solution {

    public static void main(String[] args) {
        String numberStr = "147852369";
        for (char symbol : numberStr.toCharArray()) {
            System.out.print(digitToText(symbol));
            System.out.print(" ");
        }
        System.out.println();
    }

    public static String digitToText(char digit) {
        String result = "";
        switch (digit) {
            case '0':
                result = "zero";
            case '1':
                result = "one";
            case '2':
                result = "two";
            case '3':
                result = "three";
            case '4':
                result = "four";
            case '5':
                result = "five";
            case '6':
                result = "six";
            case '7':
                result = "seven";
            case '8':
                result = "eight";
            case '9':
                result = "nine";
        }
        return result;
    }
}
