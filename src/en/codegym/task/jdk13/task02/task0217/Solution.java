package en.codegym.task.jdk13.task02.task0217;

/* 
Minimum of four numbers
*/

public class Solution {
    public static int min(int a, int b, int c, int d) {
        int min1 = min(a, b);
        int min2 = min(c, d);
        return min1 < min2 ? min1 : min2;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
/*
Recommended solution
   public static int min(int a, int b, int c, int d) {
        return min(min(a, b), min(c, d));
    }

 */