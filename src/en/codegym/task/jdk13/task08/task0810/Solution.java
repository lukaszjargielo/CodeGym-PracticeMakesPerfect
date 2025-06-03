package en.codegym.task.jdk13.task08.task0810;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Measure how long it takes to perform 10,000 get and set calls on each list
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList<>())));
        System.out.println(getGetTimeInMs(fill(new LinkedList<>())));
    }

    public static List<Object> fill(List<Object> list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List<Object> list) {
        long start = System.nanoTime();

        get10000(list);

        long stop = System.nanoTime();

        return (stop - start) / 1_000_000;

    }

    public static void get10000(List<Object> list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}

/*
Recommended solution
 public static long getGetTimeInMs(List<Object> list) {
        Date start = new Date();
        get10000(list);
        Date end = new Date();
        return end.getTime() - start.getTime();
    }
 */