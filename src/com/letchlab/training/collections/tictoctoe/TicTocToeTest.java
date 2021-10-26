package com.letchlab.training.collections.tictoctoe;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1. There has to be two players
 * 2. Both the players chooses either X or O to mark there cells.
 * 3. First player will always choose to start with X.
 * 4. He chooses on which cell to keep X.
 * 5. Now, both 0 and X play alternatively until any one of the two wins.
 * 6. Winning Criteria : Whenever any of the two players has full filled row/column/diagonal with his symbol (X/O),
 * he wins and and the games.
 * 7. if neither of the two players wins, the game is said to have ended in a draw.
 */
public class TicTocToeTest
{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        TicTocToe ticTocToe = new TicTocToe();
        ticTocToe.board = new String[9];
        ticTocToe.turn = "X";
        String winner = null;

        for ( int a =0; a <9 ; a ++) {
            ticTocToe.board[a] = String.valueOf(a + 1);
        }
        System.out.println("Please start playing 3 X 3 Tic Toc Toe. ");

        ticTocToe.printBoard();

        System.out.println(" X will play first. Enter a slot number to place X in:");

        while (winner == null){
            int numinput;

            try {
                numinput = in.nextInt();

                if (!(numinput > 0 && numinput <= 9)) {
                    System.out.println("Invalid Input; please re-enter the slot number");
                    continue;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input; please re-enter slot number" + ex.getMessage());
                continue;
            }

            if (ticTocToe.board[numinput -1].equals(String.valueOf(numinput))) {
                ticTocToe.board[numinput -1] = ticTocToe.turn;

                if (ticTocToe.turn.equals("X")) {
                    ticTocToe.turn = "O";
                } else {
                    ticTocToe.turn = "X";
                }
                ticTocToe.printBoard();
                winner = ticTocToe.checkWinner();
            } else {
                System.out.println("Slot not available, please re-enter another slot.");
            }


        }

        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("Thanks for Playing. Its a Draw !!");
        } else {
            System.out.println("Congratulations! " + winner);
        }

    }
}
