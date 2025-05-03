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

        for (int i = 1; i < collection.length ; i++) {
            collection[i] = new BoardGame();
        }

        collection[1].name = "Abalone";
        collection[2].name = "Puerto Rico";
        collection[3].name = "La cosa nostra";
        collection[4].name = "Jaipur";

        System.out.println(Arrays.toString(collection));
    }
}