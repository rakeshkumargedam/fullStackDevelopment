package com.letchlab.training.collections.tictoctoe;

import java.util.Arrays;

public class TicTocToe
{
     String[] board;
     String turn;



     String checkWinner() {
        for (int a = 0; a < 8; a++) {

            String line = null;

            switch (a) {

                /* Row Checks */
                case 0:
                    line = board[0] + board [1] + board[2];
                    break;
                case 1:
                    line = board[3] + board [4] + board[5];
                    break;
                case 2:
                    line = board[6] + board [7] + board[8];
                    break;

                /* Column Checks */
                case 3:
                    line = board[0] + board [3] + board[6];
                    break;
                case 4:
                    line = board[1] + board [4] + board[7];
                    break;
                case 5:
                    line = board[2] + board [5] + board[8];
                    break;

                /* Diagonal Checks */
                case 6:
                    line = board[0] + board [4] + board[8];
                    break;
                case 7:
                    line = board[2] + board [4] + board[6];
                    break;
            }

            // For Winner X

            if (line.equals("XXX")) {
                return "X";
            } else {
                /** For Winner O */
                if (line.equals("OOO")) {
                    return "O";
                }
            }


        }

        /** Rules for Draw **/

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(String.valueOf(a + 1))) {
                break;
            }
            else if ( a == 8) {
                return "draw";
            }
        }

        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
        return null;
    }

     void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

}
