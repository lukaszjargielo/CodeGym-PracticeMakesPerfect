package en.codegym.task.jdk13.task09.task0905;

/* 
The method returns a result — the depth of its stack trace
*/

public class Solution {
    public static void main(String[] args) {

        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        int stackTraceDepth = Thread.currentThread().getStackTrace().length;
        System.out.println(stackTraceDepth);
        return stackTraceDepth;
    }
}

