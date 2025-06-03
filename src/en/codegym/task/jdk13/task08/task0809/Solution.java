package en.codegym.task.jdk13.task08.task0809;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Measure how long it takes to perform 10,000 insertions on each list.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        long start = System.currentTimeMillis();

        insert10000(list);

        long stop = System.currentTimeMillis();

        return stop - start;

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}

/*
Recommended solution
public static long getInsertTimeInMs(List list) {
        Date start = new Date();
        insert10000(list);
        Date end = new Date();
        return end.getTime() - start.getTime();
    }
 */