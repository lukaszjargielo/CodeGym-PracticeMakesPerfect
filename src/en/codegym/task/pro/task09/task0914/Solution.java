package en.codegym.task.pro.task09.task0914;

/* 
Path update
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        String newPath = "At least one parameter is invalid";
        if ((path != null && !path.isEmpty()) && (jdk != null && !jdk.isEmpty())) {
            int indexStart = path.indexOf("jdk");
            int indexStop = path.indexOf("/", indexStart);
            String oldJdk = path.substring(indexStart, indexStop);
            newPath = path.replace(oldJdk, jdk);
            return newPath;
        }
        return newPath;
    }
}
/*
My second solution
    public static String changePath(String path, String jdk) {
        if ((path != null && !path.isEmpty()) && (jdk != null && !jdk.isEmpty())) {
            String newPath = path.replaceFirst("jdk.+?/",   jdk + "/");
            return newPath;
        }
        return "At least one parameter is invalid";
    }

My third solution
    public static String changePath(String path, String jdk) {
        String newPath = "At least one parameter is invalid";
        if ((path != null && !path.isEmpty()) && (jdk != null && !jdk.isEmpty())) {
            String[] split = path.split("\\/");
            for (int i = 0; i < split.length; i++) {
                if (split[i].startsWith("jdk")) {
                    split[i] = jdk;
                    break;
                }
            }
            newPath = String.join("/", split);
            ;
        }
        return newPath;
    }
 */