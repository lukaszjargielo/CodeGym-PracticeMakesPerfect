package en.codegym.task.jdk13.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Positive and negative numbers
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int intputNumber = Integer.parseInt(reader.readLine());

        if(intputNumber > 0) {
            intputNumber = intputNumber*2;
        } else if (intputNumber < 0){
            intputNumber = intputNumber + 1;
        }
        System.out.println(intputNumber);
    }

}