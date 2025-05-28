package en.codegym.task.jdk13.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Three arrays
*/

public class Solution {

    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> divBy3 = new ArrayList<>();
    public static ArrayList<Integer> divBy2 = new ArrayList<>();
    public static ArrayList<Integer> others = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        for (var element : numbers) {
            if (element == 0) {
                others.add(element);
                continue;
            }
            if (element % 2 == 0) {
                divBy2.add(element);
            }
            if (element % 3 == 0) {
                divBy3.add(element);
                continue;
            }
            if (element % 2 != 0 && element % 3 != 0) {
                others.add(element);
            }
        }

        printList(divBy3);
        System.out.println();
        printList(divBy2);
        System.out.println();
        printList(others);
    }

    public static void printList(ArrayList<Integer> list) {
        for (var element : list) {
            System.out.println(element);
        }
    }
}

/*
Recommended solution

 if ((number % 3 == 0) || (number % 2 == 0)) {
                if (number % 3 == 0) {
                    divBy3.add(number);
                }
                if (number % 2 == 0) {
                    divBy2.add(number);
                }
            } else {
                others.add(number);
            }
        }
 */