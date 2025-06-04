package en.codegym.task.jdk13.task08.task0813;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
20 words that start with the letter "L"
*/

public class Solution {
    public static Set<String> createSet() {
        Set<String> wordsStartsWithL = new HashSet<>();

        wordsStartsWithL.addAll(List.of("Lumbago", "Lamp", "Light",
                "Leopard", "Lambda", "Love", "Look", "Long", "Loud", "Letter",
                "Like", "Luck", "Laugh", "Learn", "Live", "Large", "Late", "Limit",
                "Lose", "Logic"));

        return wordsStartsWithL;
    }

    public static void main(String[] args) {

    }
}
