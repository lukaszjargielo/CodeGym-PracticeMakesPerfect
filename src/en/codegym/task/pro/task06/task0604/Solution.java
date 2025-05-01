package en.codegym.task.pro.task06.task0604;

/* 
The Liverpool 4
*/

public class Solution {
    public static void main(String[] args) {
        String navigator = "John";
        String pilot = "Paul";
        String secondPilot = "George";
        String flightEngineer = "Ringo";
        createCrew(navigator, pilot, secondPilot, flightEngineer);
    }

    public static void createCrew(String name1, String name2, String name3, String name4) {
        System.out.println("The four who are to conquer the cosmos:");
        System.out.println("Navigator: " + name1);
        System.out.println("Pilot: " + name2);
        System.out.println("Second pilot: " + name3);
        System.out.println("Flight engineer:" + name4);
    }
}
