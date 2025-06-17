package en.codegym.task.jdk13.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Vowels and consonants
*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            char[] charsInString = reader.readLine().toCharArray();
            String vowelsOutput = "";
            String consonantsAndPunctuationMarksOutput = "";
            for (char letter : charsInString) {
                if (isVowel( letter)){
                    vowelsOutput += letter + " ";
                } else if (letter != ' '){
                   consonantsAndPunctuationMarksOutput += letter + " ";
                } else {
                    continue;
                }
            }
            System.out.println(vowelsOutput);
            System.out.println(consonantsAndPunctuationMarksOutput);
        }

    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // Convert to lowercase
        for (char vowel : vowels) {  // Look for vowels in the array
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}

/*
Recommended solution

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        for (char character : string.toCharArray()) {
            if (isVowel(character)) {
                builder1.append(character).append(" ");
            } else if (character != ' ') {
                builder2.append(character).append(" ");
            }
        }

        System.out.println(builder1);
        System.out.println(builder2);
    }
 */