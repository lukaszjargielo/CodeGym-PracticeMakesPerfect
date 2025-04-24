package en.codegym.task.jdk13.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Day of the week
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int intDayOfTheWeek = Integer.parseInt(reader.readLine());
        String returnedDay = "";

        returnedDay = getDayName(intDayOfTheWeek);
        System.out.println(returnedDay);
    }

    public static String getDayName(int intDayOfTheWeek) {
        switch (intDayOfTheWeek) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "No such day of the week";
        }
    }
}
