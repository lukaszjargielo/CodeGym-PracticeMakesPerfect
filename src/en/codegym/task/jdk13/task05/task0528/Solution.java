package en.codegym.task.jdk13.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Display today's date
*/

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM dd yyyy");
        String today = formatter.format(date);
        System.out.println(today);
    }
}

/*
My alternative solution

 LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("LL dd yyyy", new Locale("pl"));
        String today2 = localDate.format(dateTimeFormatter);
        System.out.println(today2);
 */

/*
Recommended solution

SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy");
        System.out.println(simpleDateFormat.format(new Date()));
 */