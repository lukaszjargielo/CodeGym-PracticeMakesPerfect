package en.codegym.task.jdk13.task07.task0716;

import java.util.ArrayList;

/*
R or L
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("rose");
        strings.add("love");
        strings.add("lyra");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); ) {
            if (strings.get(i).contains("r") && !strings.get(i).contains("l")) {
                strings.remove(strings.get(i));
            } else if (strings.get(i).contains("l") && !strings.get(i).contains("r")) {
                strings.add(0, strings.get(i));
                i+=2;
            } else {
                i++;
            }
        }
        return strings;
    }
}

/*
Recommended solution

    public static ArrayList<String> fix(ArrayList<String> strings) {

        String r = "r";
        String l = "l";

        ArrayList<String> result = new ArrayList<>();
        for (String string : strings) {
            boolean isR = string.contains(r);
            boolean isL = string.contains(l);

            if (isR && !isL) {
                continue;
            }

            if (!isR && isL) {
                result.add(string);
            }

            result.add(string);
        }
        return result;
    }
}
 */