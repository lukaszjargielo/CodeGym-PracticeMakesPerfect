package en.codegym.task.jdk13.task09.task0901;

/* 
Returning a stack trace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return stackTrace;
    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return stackTrace;
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return stackTrace;
    }

    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return stackTrace;
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return stackTrace;
    }
}

/*
Recommended solution

   public static StackTraceElement[] method3() {
        method4();
        return Thread.currentThread().getStackTrace();
    }
 */
