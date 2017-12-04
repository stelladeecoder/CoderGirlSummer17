
/**
 * This pogram allows two users to play a game of Tic Tac Toe.
 *
 * @author (Delores Carey)
 * @version (9/21/17)
 */
import java.util.Scanner;
import java.io.*;

public class TicTacToe
{

    static char PLACEHOLDER = '-';
    static Scanner keyboard = new Scanner(System.in);

    // Print tic tac toe board 
    public static void printBoard(char[][] board) 
    {
        System.out.println("-------------");

        for (int i = 0; i < 3; i++) 
        {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Empty board
    public static char[][]createEmptyBoard()
    {
        char[][] gameBoard = new char[3][3];
        // Loop through rows
        for (int i = 0; i < 3; i++) 
        {

            // Loop through columns
            for (int j = 0; j < 3; j++) 
            {
                gameBoard[i][j] = PLACEHOLDER;

            }

        }
        return gameBoard;
    }
    // Loop through all cells of the board and if one is found to be empty (contains char PLACEHOLDER) then return false.
    // Otherwise the board is full.
    public static boolean isBoardFull(char[][] board) 
    {
        for (int i = 0; i<3; i++)
        { for (int j = 0; j<3; j++)
            { if    (board[i][j] == PLACEHOLDER)
                { 
                    return false; 
                }
            } 
        }
        return true; 
    }

    // Loop through rows and see if any are winners.
    public static boolean checkRowsForWin(char[][] board) 
    {
        for (int i = 0; i <3; i ++)

        { if ((board [i][0] == board [i][1]) && (board [i][0] == board [i][2] )&& (board [i][0] != PLACEHOLDER))
            { 
                return true;
            } 

        }   
        return false; 
    }

    // Loop through columns and see if any are winners.
    public static boolean checkColumnsForWin(char[][] board) 
    {
        for (int j = 0; j<3; j++)
        { if ((board [0][j] == board [1][j]) && (board [0][j] == board [2][j] )&& (board [0][j] != PLACEHOLDER))
            { 
                return true; 
            } 

        }   
        return false; 

    }

    // Check the two diagonals to see if either is a win. Return true if either wins.
    public static boolean checkDiagonalsForWin(char[][] board) 
    {
        if ((board[0][0] == board[1][1]) && (board[0][0] == board[2][2]) && (board [0][0] != PLACEHOLDER))
        { 
            return true; 
        } 
        if ((board[0][2] == board[1][1]) && (board[0][2] == board[2][0]) && (board [0][2] != PLACEHOLDER))
        { 
            return true; 
        } 
        return false; 
    }
    // Returns true if there is a win, false otherwise.
    // This calls win check functions to check the entire board.

    public static boolean checkForWin(char[][] board) 
    {
        return (checkRowsForWin(board) || checkColumnsForWin(board) || checkDiagonalsForWin(board));

    }
    //print welcome screen
    public static void printWelcome()
    {
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("To play, enter a number for which box to play in.");
        System.out.println("1 2 3");
        System.out.println("4 5 6");
        System.out.println("7 8 9");
        System.out.println("You'll need a partner to play with.  Ready to begin?  Let's get ready to Rumble!");
    }
    //Ask player to play again
    public static boolean wantsToPlayAgain()
    {
        System.out.print("Would you like to play again? Enter yes or no");
        boolean repeat = false; 
        do
        {
            String again = keyboard.nextLine(); 
            if( again.equals( "yes"))

            {repeat = false; 
                return true;} 
            if (again.equals("no"))
            {repeat = false; 
                return false;}
            if ((!again.equals("no")) && (!again.equals("yes")))
                repeat = true; 

        } while( repeat = true); 
        return false; 
    }

    public static char getTokenAtPosition(int position, char[][] board)
    {
        int row = (position - 1) / 3;
        int col = (position - 1) % 3;
        return board[row][col];
    }   
    // Changes player token back and forth.
    public static void placeToken(int position, char[][] board, boolean isXTurn)
    {
        int row = (position - 1) / 3;
        int col = (position - 1) % 3;
        if (isXTurn) {
            board[row][col] = 'x';
        } else {
            board[row][col] = 'o';
        }
    }
    //ask where to place token 
    public static void getPositionAndPlaceToken(char[][] board, boolean isXTurn)
    {
        boolean invalidInput = true;
        boolean full = true;
        int position = 0;

        do {
            if (isXTurn) {
                System.out.print("x where? ");
            } else {
                System.out.print("o where? ");
            }
            position = keyboard.nextInt();
            invalidInput = (position < 1 || position > 9);
            if (invalidInput) {
                System.out.println("Oh no baby, this  " + position + " is not valid.  Try 1-9.");
            } else {
                full = (getTokenAtPosition(position, board) != PLACEHOLDER);
                if (full) {
                    System.out.println("Oh no baby, this " + position + " is already full.  Pick another.");
                }
            }
        } while (full || invalidInput);

        placeToken(position, board, isXTurn);
    }

    public static void game()
    {
        int xWins = 0;
        int oWins = 0;
        int draws = 0;
        boolean doesXStart = true;
        boolean isXTurn = doesXStart;

        printWelcome();
        // all-games loop
        do{
            // initialize for the beginning of a new game.
            char[][] gameBoard = createEmptyBoard();
            isXTurn = doesXStart;
            doesXStart = ! doesXStart;
            boolean gameStillGoing = true;
            printBoard(gameBoard);

            // play the game until it's complete.  single-game loop.
            do {
                getPositionAndPlaceToken(gameBoard, isXTurn);
                printBoard(gameBoard);
                if (checkForWin(gameBoard)) {
                    gameStillGoing = false;
                    if (isXTurn) {
                        // X made the most recent play, so they must have won that round.
                        xWins++;
                        System.out.println("X wins!");
                    } else {
                        // O made the most recent play, so they must have won that round.
                        oWins++;
                        System.out.println("O wins!");
                    }
                } else if (isBoardFull(gameBoard)) {
                    gameStillGoing = false;
                    // Nobody won, but the board is full - must be a draw.
                    draws++;
                    System.out.println("The game is a draw.  Nobody wins.");
                } else {
                    // board is not full, so continue to next player's turn.
                }
                isXTurn = ! isXTurn;
            } while (gameStillGoing);
            System.out.println("Score: X=" + xWins + ", O=" + oWins + ", draws=" + draws);

        } while (wantsToPlayAgain());

        // They're done playing.  Method will return and program will finish.
    }

    public static void main(String[] args)
    {
        game();
        System.out.println("Buenos Noches");
    }
}