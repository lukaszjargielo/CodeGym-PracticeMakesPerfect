package en.codegym.task.jdk13.task06.task0633;

/* 
Cutting down the middle
*/

public class Solution {
    public static char[][] chars = {
            {'a', 'b', 'c', 'd', 'e', 'f'},
            {'j', 'h', 'i', 'j', 'k', 'l'},
            {'m', 'n', 'o', 'p', 'q', 'r'},
            {'s', 't', 'u', 'v', 'w', 'x'}};

    public static void main(String[] args) {
        printArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                if((i != 0) && (i != chars.length - 1) && (j != 0) && (j != chars[i].length - 1)) {
                    chars[i][j] =  '-';
                }
            }
        }

        printArray();
    }

    private static void printArray() {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

/*
Draft
/*

 chars[1] = new char[]{'j', '-', '-', '-', '-', 'l'};
 chars[2] = new char[]{'m', '-', '-', '-', '-', 'r'};

      for(int i = 1; i < chars.length-1`; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                if(chars[i][j] >= 104 && chars[i][j] <= 107 || chars[i][j] >= 110 && chars[i][j] <= 113) {
                    chars[i][j] = '-';
                }
            }
        }
*/



