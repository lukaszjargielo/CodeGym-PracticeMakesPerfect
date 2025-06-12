package en.codegym.task.jdk13.task09.task0918;

/* 
Creating your own exceptions
*/

import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends IOException {
    }

    static class MyException2 extends RuntimeException{
    }

    static class MyException3 extends NumberFormatException {
    }

    static class MyException4 extends Exception{
    }
}

/*
Recommended solution

static class MyException extends Throwable {
    }

    static class MyException2 extends ClassNotFoundException {
    }

    static class MyException3 extends RuntimeException {
    }

    static class MyException4 extends IllegalStateException {
    }
 */