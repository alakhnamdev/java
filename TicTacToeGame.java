import java.util.Scanner;

public class TicTacToeGame {
    private final int r = 3;
    private final int c = 3;
    private char token = 'O';
    private int counter = 0;
    private final char grid[][] = new char[r][c];
    private final Scanner sc = new Scanner(System.in);

    public TicTacToeGame() {
        String message = """
                Welcome to Tic-Tac-Toe XO :-
                Instructions :-
                1) Two Players can play this game.
                2) Player O will always start first.
                3) Player O & X will get turns one after another.
                4) Positions for playing -
                   -------------
                   | 1 | 2 | 3 |
                   -------------
                   | 4 | 5 | 6 |
                   -------------
                   | 7 | 8 | 9 |
                   -------------
                """;
        System.out.print(message);
    }
    
    public void startGame() {
        resetGame();
        while (true) {
            play();
            if (checkResult()) {
                if (restartGame()) {
                    resetGame();
                } else {
                    return;
                }
            }
        }
    }
    
    private void display() {
        System.out.println("\n Tic Tac Toe Grid :- \n   -------------");
        for (int i = 0; i < this.r; i++) {
            System.out.print("   |");
            for (int j = 0; j < this.c; j++) {
                System.out.printf(" %s |", this.grid[i][j]);
            }
            System.out.println("\n   -------------");
        }
        System.out.println();
    }
    
    private void play() {
        while (true) {
            System.out.printf("Enter Position (Player %s) : ", token);
            int pos = this.sc.nextInt();
            if (pos > 0 && pos < 10 && this.counter < 10) {
                if (updateToken(pos)) {
                    display();
                    return;
                }
            } else {
                System.out.println("Invalid Or Occupied position try free positions!\n");
            }
        }
    }
    
    private void resetGame() {
        counter = 0;
        token = 'O';
        for (int i = 0; i < this.r; i++) {
            for (int j = 0; j < this.c; j++) {
                this.grid[i][j] = ' ';
            }
        }
        display();
    }
    
    private boolean restartGame() {
        while (true) {
            System.out.print("Do you want to play Again (Y/N): ");
            char command = this.sc.next().charAt(0);
            switch (command) {
                case 'y', 'Y' -> {
                    System.out.println("\nReseting Tic Tac Toe Grid :- ");
                    return true;
                }
                case 'n', 'N' -> {
                    System.out.println("Thanks for Playing!");
                    return false;
                }
                default -> System.out.println("Wrong Command!, Please enter Y or N\n");
            }
        }
    }
    
    private boolean checkResult() {
        if (counter == 9) {
            System.out.println("This Match is Draw !!\n");
            return true;
        }

        int[][] winLines = {
                { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, // rows
                { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 }, // columns
                { 0, 4, 8 }, { 2, 4, 6 } // diagonals
        };

        for (int line[] : winLines) {
            char a = getCellValue(line[0]);
            char b = getCellValue(line[1]);
            char c = getCellValue(line[2]);
            if (a == b && b == c && a != ' ') {
                System.out.printf("%s is the Winner!!!\n\n", this.token == 'X' ? 'O' : 'X');
                return true;
            }
        }
        return false;
    }
    
    private char getCellValue(int place) {
        return grid[(place) / 3][(place) % 3];
    }
    
    private boolean updateToken(int place) {
        int row = (place - 1) / 3;
        int column = (place - 1) % 3;
        if (this.grid[row][column] == ' ') {
            this.counter++;
            this.grid[row][column] = this.token;
            this.token = token == 'X' ? 'O' : 'X';
            return true;
        } else {
            System.out.println("Invalid Position, try free or valid positions !\n");
        }
        return false;
    }

    public static void main(String[] args) {
        TicTacToeGame tt = new TicTacToeGame();
        tt.startGame();
    }
}