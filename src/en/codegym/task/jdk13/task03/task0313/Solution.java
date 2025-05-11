package en.codegym.task.jdk13.task03.task0313;

/* 
Sam I Am
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String str1 = "Sam";
        String str2 = "I";
        String str3 = "Am";

        System.out.println((String.format("%s%s%s", str1, str2, str3)));
        System.out.println((String.format("%s%s%s", str1, str3, str2)));
        System.out.println((String.format("%s%s%s", str2, str1, str3)));
        System.out.println((String.format("%s%s%s", str2, str3, str1)));
        System.out.println((String.format("%s%s%s", str3, str1, str2)));
        System.out.println((String.format("%s%s%s", str3, str2, str1)));

    }
}
/*
My alternative solutions

        System.out.printf("%s%s%s\n", str1, str2, str3);
        System.out.printf("%s%s%s\n", str1, str3, str2);
        System.out.printf("%s%s%s\n", str2, str1, str3);
        System.out.printf("%s%s%s%n", str2, str3, str1);
        System.out.printf("%s%s%s%n", str3, str1, str2);
        System.out.printf("%s%s%s%n", str3, str2, str1);

        public static void printAllCombinations(String... str) {
            String[] words = {str1, str2, str3};
            List<String> combinations = new ArrayList<>();

            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < words.length; j++) {
                    if(j == i) continue;
                    for (int k = 0; k < words.length; k++) {
                        if(k == j || k == i) continue;
                        combinations.add(words[i]+words[j]+words[k]);
                }
            }
        }

        for (var s : combinations) {
            System.out.println(s);
        }
    }
 }
 */