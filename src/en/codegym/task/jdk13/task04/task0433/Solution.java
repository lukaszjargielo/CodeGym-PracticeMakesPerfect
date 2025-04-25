package en.codegym.task.jdk13.task04.task0433;

/* 
Seeing dollars in your future
*/

public class Solution {
    public static void main(String[] args) {
        int innerCounter = 0;
        int outerCounter = 0;
        while (outerCounter < 10) {
            while (innerCounter < 10) {
                System.out.print("$");
                innerCounter++;
            }
            System.out.println();
            innerCounter = 0;
            outerCounter++;
        }
    }
}

/*
Recommended solution
      int i = 0;

        while (i < 10) {
            System.out.println("$$$$$$$$$$");
            i++;
        }
 */
