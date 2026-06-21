import java.util.Scanner;

class Matrix {
    int r, c;
    int matrix[][];
    Scanner sc = new Scanner(System.in);

    public Matrix(int rows, int columns) {
        this.r = rows;
        this.c = columns;
        matrix = new int[r][c];
        System.out.printf("\nMatrix Initialized\nOrder of Matrix = %d x %d\n\n", r, c);
    }

    public void inputElements() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Enter Element Matrix[%d][%d] = ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public void printElements() {
        System.out.println("\nMatrix :- ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter Columns : ");
        int columns = sc.nextInt();

        Matrix mt = new Matrix(rows, columns);
        mt.inputElements();
        mt.printElements();
    }
}
