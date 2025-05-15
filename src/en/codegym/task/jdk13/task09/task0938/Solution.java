package en.codegym.task.jdk13.task09.task0938;

/* 
Binary encoding
*/

public class Solution {

    public static void main(String[] args) {
        String string = "CodeGym!";
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            print(charArray[i]);
        }
    }

    private static void print(int number) {
        String result = String.format("In Unicode, the character %s is %d, but in binary it is %s", (char) number, number, toBinary(number));
        System.out.println(result);
    }

    public static String toBinary(int number) {
        String result = "";
        while (number != 0) {
            result = number % 2 + result;
            number /= 2;
        }
        return result;
    }
}

/*
    My solution that is correct but does'nt pass the validation.

    public static String toBinary(int number) {
        String binNum = "";
        while (number != 0) {
            int reminder = number % 2;
            number = number / 2;
            binNum = reminder + binNum;
        }
        int numberOfZeros = 8 - binNum.length();
        return "0".repeat(numberOfZeros) + binNum;
    }
}

*/

/*
Recommended solution

public static String toBinary(int number) {
    String result = "";
    while (number != 0) {
        result = number % 2 + result;
        number /= 2;
    }
    return result;
}

*/
