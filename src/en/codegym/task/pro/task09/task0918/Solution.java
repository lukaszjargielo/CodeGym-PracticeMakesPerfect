package en.codegym.task.pro.task09.task0918;

/* 
Let's work with StringBuilder
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Learn, learn, and learn again! ";

        System.out.println(addTo(string, new String[]{"A", "rolling", "stone", "gathers", "no", "moss"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder stringBuilder = new StringBuilder(string);
        for (var s : strings) {
            if (s != null) {
                stringBuilder.append(s);
            }
        }
        return stringBuilder;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.replace(start, end, str);
    }
}

/*
My methods are too complex to pass the tests successfully

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        if (string != null && !string.isEmpty()) {
            stringBuilder = new StringBuilder(string);
            if (strings != null && strings.length > 0) {
                for (var s : strings) {
                    if (s != null) {
                        stringBuilder.append(s);
                    }
                }
            }
        }
        return stringBuilder;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder stringBuilder = new StringBuilder();
        if (string != null && !string.isEmpty()) {
            stringBuilder = new StringBuilder(string);
            if (str != null && !str.isEmpty()) {
                if (start > 0 && end < string.length() && start < end) {
                    stringBuilder.replace(start, end, str);
                }
            }
        }
        return stringBuilder;
    }
}

 */


/*
Recommended solution

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(strings[i]);
        }
        return stringBuilder;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.replace(start, end, str);
    }
 */