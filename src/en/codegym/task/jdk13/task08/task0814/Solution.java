package en.codegym.task.jdk13.task08.task0814;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
Greater than 10? You're not a good fit for us
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> numbers = new HashSet<>();
        numbers.addAll(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
        return numbers;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(num -> num > 10);
    }

    public static void main(String[] args) {
  /*      Set<Integer> set = createSet();
        System.out.println(set.toString());
        removeAllNumbersGreaterThan10(set);
        System.out.println(set.toString());*/
    }
}

/*
Recommended solution

   public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        set.add(16);
        set.add(26);
        set.add(36);
        set.add(46);
        set.add(56);
        set.add(66);
        set.add(76);
        set.add(86);
        set.add(10);
        set.add(6);

        set.add(17);
        set.add(27);
        set.add(37);
        set.add(47);
        set.add(57);
        set.add(67);
        set.add(77);
        set.add(87);
        set.add(97);
        set.add(7);

        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> copy = new HashSet<>(set);
        for (Integer number : copy) {
            if (number > 10) {
                set.remove(number);
            }
        }
    }
 */