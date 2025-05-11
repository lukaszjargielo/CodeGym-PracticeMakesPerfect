package en.codegym.task.jdk13.task09.task0934;

/* 
Word palindrome
*/

public class Solution {
    public static void main(String[] args) {
        String word = "Rotor";
        String answer = isPalindrome(word) ? "Yes" : "No";
        System.out.println("Is the word \"" + word + "\" a palindrome? " + answer);
    }

    public static boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }
        word = word.toLowerCase();
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
/*
Recommended solution

   public static boolean isPalindrome(String word) {
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();
        return word.equalsIgnoreCase(builder.toString());
    }
 */
