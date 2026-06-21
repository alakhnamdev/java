import java.util.Scanner;

public class TicTacToe {
    private final int r = 3;
    private final int c = 3;
    private int counter = -1;
    private final int positions[] = new int[r * c];
    private final int matrix[][] = new int[r][c];
    private char token = 'X';
    private int turn = 1;
    private final Scanner sc = new Scanner(System.in);
    private final String message = """
            Welcome to Tic-Tac-Toe XO :-
            Instructions :-
            1) Two Players can play this game.
            2) Player O will always start first.
            3) Player O & X will get turns one after another.
            4) For playing this Game you have to enter position each time to update value in Tic Tac Toe Grid.
            5) Positions for playing -
                -------------
                | 1 | 2 | 3 |
                -------------
                | 4 | 5 | 6 |
                -------------
                | 7 | 8 | 9 |
                -------------
            """;

    public TicTacToe() {
        System.out.println(message);
    }

    void startGame() {
        resetGame();
        counter = -1;
        turn = 1;
        display();
        while (counter < 9) {
            play();
            display();
            if (checkResult() || counter == positions.length - 1) {
                if (counter == positions.length - 1) {
                    System.out.println("This Match is Draw !!\n");
                }
                while (true) {
                    System.out.print("Do you want to play Again (Y/N): ");
                    char command = this.sc.next().charAt(0);
                    if (command == 'y' || command == 'Y') {
                        System.out.println("\n\nReseting Tic Tac Toe Grid :- ");
                        counter = -1;
                        turn = 1;
                        startGame();
                    } else if (command == 'n' || command == 'N') {
                        System.out.println("Thanks for Playing!");
                        return;
                    } else {
                        System.out.println("Wrong Command!, Please enter Y or N\n");
                    }
                }
            }
        }
    }

    private boolean findPosition(int value) {
        for (int i = 0; i < this.positions.length; i++) {
            if (this.positions[i] == value) {
                return true;
            }
        }
        return false;
    }

    private void display() {
        System.out.println("Tic Tac Toe Grid :- \n-------------");
        for (int i = 0; i < this.r; i++) {
            System.out.print("|");
            for (int j = 0; j < this.c; j++) {
                token = switch (this.matrix[i][j]) {
                    case 0 -> 'X';
                    case 1 -> 'O';
                    default -> ' ';
                };
                System.out.printf(" %s |", token);
            }
            System.out.println("\n-------------");
        }
        System.out.println();
    }

    private void play() {
        System.out.printf("Enter Position (Player %s) : ", (this.turn == 1 ? 'O' : 'X'));
        int pos = this.sc.nextInt();
        if (!findPosition(pos) && pos > 0 && pos < 10) {
            if (this.counter < 9) {
                positions[++this.counter] = pos;
                updateToken(pos);
                this.turn = this.turn == 1 ? 0 : 1;
            }
        } else {
            System.out.println("Invalid Or Occupied position try free positions!\n");
            play();
        }
    }

    private void resetGame() {
        for (int i = 0; i < this.r; i++) {
            for (int j = 0; j < this.c; j++) {
                this.matrix[i][j] = -1;
            }
        }
        for (int i = 0; i < this.positions.length; i++) {
            this.positions[i] = 0;
        }
    }

    private boolean checkResult() {
        // O Winning Cases
        if (this.matrix[0][0] == 1 && this.matrix[1][0] == 1 && this.matrix[2][0] == 1) {
            System.out.println("O is the Winner !!!\n");
            return true;
        }
        if (this.matrix[0][1] == 1 && this.matrix[1][1] == 1 && this.matrix[2][1] == 1) {
            System.out.println("O is the Winner !!!\n");
            return true;
        }
        if (this.matrix[0][2] == 1 && this.matrix[1][2] == 1 && this.matrix[2][2] == 1) {
            System.out.println("O is the Winner !!!\n");
            return true;
        }
        if (this.matrix[0][0] == 1 && this.matrix[0][1] == 1 && this.matrix[0][2] == 1) {
            System.out.println("O is the Winner !!!\n");
            return true;
        }
        if (this.matrix[0][0] == 1 && this.matrix[0][1] == 1 && this.matrix[0][2] == 1) {
            System.out.println("O is the Winner !!!\n");
            return true;
        }
        if (this.matrix[1][0] == 1 && this.matrix[1][1] == 1 && this.matrix[1][2] == 1) {
            System.out.println("O is the Winner !!!\n");
            return true;
        }
        if (this.matrix[2][0] == 1 && this.matrix[2][1] == 1 && this.matrix[2][2] == 1) {
            System.out.println("O is the Winner !!!\n");
            return true;
        }
        if (this.matrix[0][0] == 1 && this.matrix[1][1] == 1 && this.matrix[2][2] == 1) {
            System.out.println("O is the Winner !!!\n");
            return true;
        }
        if (this.matrix[0][2] == 1 && this.matrix[1][1] == 1 && this.matrix[2][0] == 1) {
            System.out.println("O is the Winner !!!\n");
            return true;
        }

        // X Winning Cases
        if (this.matrix[0][0] == this.matrix[1][0] && this.matrix[1][0] == this.matrix[2][0] && this.matrix[2][0] == 0) {
            System.out.println("X is the Winner !!!\n");
            ;
            return true;
        }
        if (this.matrix[0][1] == this.matrix[1][1] && this.matrix[1][1] == this.matrix[2][1] && this.matrix[2][1] == 0) {
            System.out.println("X is the Winner !!!\n");
            ;
            return true;
        }
        if (this.matrix[0][2] == this.matrix[1][2] && this.matrix[1][2] == this.matrix[2][2] && this.matrix[2][2] == 0) {
            System.out.println("X is the Winner !!!\n");
            ;
            return true;
        }
        if (this.matrix[0][0] == this.matrix[0][1] && this.matrix[0][1] == this.matrix[0][2] && this.matrix[0][2] == 0) {
            System.out.println("X is the Winner !!!\n");
            ;
            return true;
        }
        if (this.matrix[0][0] == this.matrix[0][1] && this.matrix[0][1] == this.matrix[0][2] && this.matrix[0][2] == 0) {
            System.out.println("X is the Winner !!!\n");
            ;
            return true;
        }
        if (this.matrix[1][0] == this.matrix[1][1] && this.matrix[1][1] == this.matrix[1][2] && this.matrix[1][2] == 0) {
            System.out.println("X is the Winner !!!\n");
            ;
            return true;
        }
        if (this.matrix[2][0] == this.matrix[2][1] && this.matrix[2][1] == this.matrix[2][2] && this.matrix[2][2] == 0) {
            System.out.println("X is the Winner !!!\n");
            ;
            return true;
        }
        if (this.matrix[0][0] == this.matrix[1][1] && this.matrix[1][1] == this.matrix[2][2] && this.matrix[2][2] == 0) {
            System.out.println("X is the Winner !!!\n");
            ;
            return true;
        }
        if (this.matrix[0][2] == this.matrix[1][1] && this.matrix[1][1] == this.matrix[2][0] && this.matrix[2][0] == 0) {
            System.out.println("X is the Winner !!!\n");
            ;
            return true;
        }
        return false;
    }

    private void updateToken(int place) {
        switch (place) {
            case 1 -> this.matrix[0][0] = this.turn;
            case 2 -> this.matrix[0][1] = this.turn;
            case 3 -> this.matrix[0][2] = this.turn;
            case 4 -> this.matrix[1][0] = this.turn;
            case 5 -> this.matrix[1][1] = this.turn;
            case 6 -> this.matrix[1][2] = this.turn;
            case 7 -> this.matrix[2][0] = this.turn;
            case 8 -> this.matrix[2][1] = this.turn;
            case 9 -> this.matrix[2][2] = this.turn;
        }
    }

    public static void main(String[] args) {
        TicTacToe tt = new TicTacToe();
        tt.startGame();
    }
}