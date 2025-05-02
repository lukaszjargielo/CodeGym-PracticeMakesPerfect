package com.codegym.task.task01.task0136;

/* 
Even to the moon!

*/

public class Solution {
    public static final double LUNAR_GRAVITY_COEFFICIENT = 0.17;

    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        return earthWeight * LUNAR_GRAVITY_COEFFICIENT;
    }


}