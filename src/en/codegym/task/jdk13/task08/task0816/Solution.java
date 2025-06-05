package en.codegym.task.jdk13.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Remove all people born in the summer
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Smith", dateFormat.parse("MAY 1 2012"));
        map.put("Taylor", dateFormat.parse("JUNE 1 2012"));
        map.put("Johnson", dateFormat.parse("JULY 31 2012"));
        map.put("Miller", dateFormat.parse("AUGUST 15 2012"));
        map.put("Wilson", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Moore", dateFormat.parse("MARCH 13 2012"));
        map.put("Anderson", dateFormat.parse("MAY 31 2012"));
        map.put("Thomas", dateFormat.parse("JUNE 30 2012"));
        map.put("Brown", dateFormat.parse("AUGUST 31 2012"));
        map.put("Davis", dateFormat.parse("SEPTEMBER 16 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        // between JUNE 1 and AUGUST 31

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> entry = iterator.next();
            Date birthDate = entry.getValue();

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(birthDate);
            int month = calendar.get(Calendar.MONTH);

            if (month >= Calendar.JUNE && month <= Calendar.AUGUST) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
       /* try {
            Map<String, Date> map = createMap() ;
            removeAllSummerPeople(map);
            System.out.println(map);
        } catch (Exception e) {
            System.out.println();
        }*/
    }
}

/*
Recommended solution

public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> copy = new HashMap<>(map);
        for (String key : copy.keySet()) {
            Date date = copy.get(key);
            int month = date.getMonth() + 1;
            if (month == 6 || month == 7 || month == 8) {
                map.remove(key);
            }
        }
    }
 */

/*
Wrong concept

if (iterator.next().getValue().after(new Date(2012, 5,1 )) || iterator.next().getValue().before(new Date(2012, 7, 31))) {
                iterator.remove();
            }
 */