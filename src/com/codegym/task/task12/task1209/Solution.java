package com.codegym.task.task12.task1209;

/* 
Three methods and a minimum

*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int min(int number1, int number2) {
        if (number1 < number2) {
            return number1;
        } else {
            return number2;
        }
    }

    public static long min(long number1, long number2) {
        return number1 < number2 ? number1 : number2;
    }

    public static double min(double number1, double number2) {
        return number1 < number2 ? number1 : number2;
    }
}
