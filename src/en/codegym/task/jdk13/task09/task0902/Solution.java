package en.codegym.task.jdk13.task09.task0902;

/* 
Stack trace revisited
*/

public class Solution {
    public static void main(String[] args) {

        method1();

//        System.out.println("From method main");

    }

    public static String method1() {

        method2();

        /*System.out.println("From method 1");
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (var el : stackTrace) {
            System.out.println(el.getMethodName());
        }
        System.out.println();
        return null;*/

        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2() {

        method3();

        /*System.out.println("From method 2");
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (var el : stackTrace) {
            System.out.println(el.getMethodName());
        }
        System.out.println();
        return null;*/

        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {

        method4();

        /*System.out.println("From method 3");
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (var el : stackTrace) {
            System.out.println(el.getMethodName());
        }
        System.out.println();
        return null;*/

        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {

        method5();

        /*System.out.println("From method 4");
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (var el : stackTrace) {
            System.out.println(el.getMethodName());
        }
        System.out.println();
        return null;*/

        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {

        /*StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println("From method 5");
        for (var el : stackTrace) {
            System.out.println(el.getMethodName());
        }
        System.out.println();
        return null;*/

        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
