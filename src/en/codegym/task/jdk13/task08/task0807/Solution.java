package en.codegym.task.jdk13.task08.task0807;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
LinkedList and ArrayList
*/

public class Solution {
    public static Object createArrayList() {
        List<Object> objectArrayList = new ArrayList<>();
        return objectArrayList;
    }

    public static Object createLinkedList() {
        List<Object> objectLinkedList = new LinkedList<>();
        return objectLinkedList;
    }

    public static void main(String[] args) {
        Object objectsArrayList = createArrayList();
        Object objectsLinkedList = createLinkedList();
    }
}
/*
Recommended solution
    public static Object createArrayList() {
        return new ArrayList();
    }

    public static Object createLinkedList() {
        return new LinkedList();
    }
 */