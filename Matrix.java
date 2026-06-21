public class Matrix {
    public static void main(String[] args) {
        int a[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int b[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int r1, r2, c1, c2;

        r1 = a.length;
        c1 = a[0].length;

        r2 = b.length;
        c2 = b[0].length;

        if (r1 == r2 && c1 == c2) {
            int sum[][] = new int[r1][c1];

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    sum[i][j] = a[i][j] + b[i][j];
                    System.out.print(sum[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}