package en.codegym.task.jdk13.task09.task0913;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/* 
Exceptions
*/

public class Solution {

    public static int i = (int) (Math.random() * 4);

    public static void main(String[] args) throws ArithmeticException, URISyntaxException {

        try {
            method1();
        } catch (NullPointerException e) {
            System.out.println(e.getClass().getSimpleName());
        } catch (FileNotFoundException e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        if (i == 0) {
            throw new NullPointerException();
        } else if (i == 1) {
            throw new ArithmeticException();
        } else if (i == 2) {
            throw new FileNotFoundException();
        } else if (i == 3) {
            throw new URISyntaxException("", "");
        }
    }
}
/*
Recommended solution

public static void main(String[] args) throws Exception {
        try {
            method1();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
 */