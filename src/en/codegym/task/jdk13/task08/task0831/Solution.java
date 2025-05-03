package en.codegym.task.jdk13.task08.task0831;

import java.util.Arrays;

/* 
Favorite board games
*/

public class Solution {

    public static BoardGame[] collection = new BoardGame[5];

    public static void main(String[] args) {
        BoardGame chess = new BoardGame();
        chess.name = "Battleship";
        collection[0] = chess;

        //write your code here


        System.out.println(Arrays.toString(collection));
    }
}