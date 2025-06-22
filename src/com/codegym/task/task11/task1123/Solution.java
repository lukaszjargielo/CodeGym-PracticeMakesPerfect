package com.codegym.task.task11.task1123;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        int[] arrayCopy = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayCopy);

        return new Pair<>(arrayCopy[0], arrayCopy[arrayCopy.length - 1]);
          }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}

/*
Recommended solution

  int minimum = array[0];
        int maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum)
                minimum = array[i];

            if (array[i] > maximum)
                maximum = array[i];
        }
 */