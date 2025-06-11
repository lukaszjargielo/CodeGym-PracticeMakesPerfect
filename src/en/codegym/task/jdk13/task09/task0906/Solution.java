package en.codegym.task.jdk13.task09.task0906;

/* 
Logging stack traces
*/

public class Solution {

    public static void main(String[] args) {

        log("In method");
    }

    public static void log(String text) {
        String fileName = Thread.currentThread().getStackTrace()[2].getFileName();
        String methodThatCalled = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(String.join(": ", fileName, methodThatCalled, text));
    }
}

/*
Recommended solution
public static void log(String text) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        String fileName = element.getFileName();
        String methodName = element.getMethodName();
        String message = fileName + ": " + methodName + ": " + text;
        System.out.println(message);
    }
 */