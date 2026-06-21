package game;

import java.util.Scanner;

public class TicTacToe {

    private final int[][] board = new int[3][3];   // -1 = empty, 0 = X, 1 = O
    private int currentPlayer = 1; // O starts first
    private final Scanner sc = new Scanner(System.in);

    private static final int[][] WIN_PATTERNS = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // rows
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // cols
            {0, 4, 8}, {2, 4, 6}             // diagonals
    };

    public TicTacToe() {
        System.out.println("""
            Welcome to Tic-Tac-Toe XO :-
            Instructions :-
            1) Two Players can play this game.
            2) Player O will always start first.
            3) Enter position 1-9 to play.
                -------------
                | 1 | 2 | 3 |
                -------------
                | 4 | 5 | 6 |
                -------------
                | 7 | 8 | 9 |
                -------------
            """);
    }

    public void start() {
        while (true) {
            resetBoard();
            playGame();

            System.out.print("Do you want to play again? (Y/N): ");
            char c = sc.next().charAt(0);

            if (c == 'N' || c == 'n') {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }

    private void resetBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = -1;

        currentPlayer = 1; // O starts
    }

    private void playGame() {
        int moves = 0;

        while (true) {
            displayBoard();
            int pos = getPlayerMove();

            placeMove(pos);
            moves++;

            if (checkWinner()) {
                displayBoard();
                System.out.println((currentPlayer == 1 ? "O" : "X") + " wins!\n");
                return;
            }

            if (moves == 9) {
                displayBoard();
                System.out.println("It's a draw!\n");
                return;
            }

            currentPlayer = 1 - currentPlayer; // switch turn
        }
    }

    private void displayBoard() {
        System.out.println("Tic Tac Toe Grid :- \n-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                char token = board[i][j] == 1 ? 'O' : board[i][j] == 0 ? 'X' : ' ';
                System.out.print(" " + token + " |");
            }
            System.out.println("\n-------------");
        }
    }

    private int getPlayerMove() {
        while (true) {
            System.out.printf("Enter Position (Player %s): ", currentPlayer == 1 ? "O" : "X");

            if (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Invalid input. Enter a number 1-9.\n");
                continue;
            }

            int pos = sc.nextInt();

            if (pos < 1 || pos > 9) {
                System.out.println("Enter a valid position 1-9!\n");
                continue;
            }

            int r = (pos - 1) / 3;
            int c = (pos - 1) % 3;

            if (board[r][c] != -1) {
                System.out.println("Position already taken. Try another.\n");
                continue;
            }

            return pos;
        }
    }

    private void placeMove(int pos) {
        int r = (pos - 1) / 3;
        int c = (pos - 1) % 3;
        board[r][c] = currentPlayer;
    }

    private boolean checkWinner() {
        for (int[] pattern : WIN_PATTERNS) {
            int a = pattern[0], b = pattern[1], c = pattern[2];

            int r1 = a / 3, c1 = a % 3;
            int r2 = b / 3, c2 = b % 3;
            int r3 = c / 3, c3 = c % 3;

            if (board[r1][c1] == currentPlayer &&
                board[r2][c2] == currentPlayer &&
                board[r3][c3] == currentPlayer)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        new TicTacToe().start();
    }
}
