package en.codegym.task.jdk13.task09.task0930;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArraySorter {

    public void sort(String[] array) {
        List<String> words = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        for (String element : array) {
            if (isNumber(element)) {
                numbers.add(Integer.parseInt(element));
            } else {
                words.add(element);
            }
        }

        numbers.sort(Comparator.reverseOrder());

        for (int i = 0; i < words.size(); i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (isGreaterThan(words.get(i), words.get(j))) {
                    String temp = words.get(i);
                    words.set(i, words.get(j));
                    words.set(j, temp);
                }
            }
        }

        int numbersIndex = 0;
        int wordsIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                array[i] = String.valueOf(numbers.get(numbersIndex));
                numbersIndex++;
            } else {
                array[i] = words.get(wordsIndex);
                wordsIndex++;
            }
        }
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

/*
Recommended solution

public void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (isNumber(array[i]) && isNumber(array[j])) {
                    if (Integer.parseInt(array[i]) < Integer.parseInt(array[j])) {
                        String temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                } else if (!isNumber(array[i]) && !isNumber(array[j])) {
                    if (isGreaterThan(array[i], array[j])) {
                        String temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
    }

 */