package en.codegym.task.jdk13.task06.task0611;

/* 
StringHelper class
*/

public class StringHelper {
    public static String multiply(String text) {
        return text.repeat(5);
    }

    public static String multiply(String text, int count) {
        return text.repeat(count);
    }

    public static void main(String[] args) {

    }
}
/*
Recommended solution

    public static String multiply(String text) {
        return multiply(text, 5);
    }

    public static String multiply(String text, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(text);
        }

        return stringBuilder.toString();
    }
 */