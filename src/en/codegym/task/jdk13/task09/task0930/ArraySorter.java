package en.codegym.task.jdk13.task09.task0930;

public class ArraySorter {

    public void sort(String[] array) {
        //write your code here
    }

    // String comparison method: 'a' is greater than 'b'
    public boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Is the passed string a number?
    public boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];
            if ((i != 0 && character == '-') // The string contains a hyphen
                || (!Character.isDigit(character) && character != '-') // or is not a number and doesn't start with a hyphen
                || (chars.length == 1 && character == '-')) // or is a single hyphen
            {
                return false;
            }
        }
        return true;
    }
}
