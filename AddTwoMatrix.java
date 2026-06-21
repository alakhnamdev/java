import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;

        System.out.print("Enter No. of Rows : ");
        r = sc.nextInt();
        System.out.print("Enter No. of Colmuns : ");
        c = sc.nextInt();

        int matrix1[][] = new int[r][c];
        int matrix2[][] = new int[r][c];
        int sum[][] = new int[r][c];

        System.out.println("Matrix 1:- ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter element : ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 2:- ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter element : ");
                matrix2[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Sum of Matrix 1 & 2:- ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
