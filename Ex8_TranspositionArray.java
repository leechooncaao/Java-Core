import java.util.Scanner;

public class Ex8_TranspositionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initializing matrix A
        int m, n;
        System.out.println("Enter number of rows and columns of matrix A :");
        m = scanner.nextInt();
        n = scanner.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = scanner.nextInt();
            }
        }
        scanner.nextLine();

        // Printing matrix A
        System.out.println("Matrix A ");
        for (int[] x : a) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Initializing matrix transposing from A - B
        int[][] b = new int[n][m];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                b[j][i] = a[i][j];
            }
        }

        // Printing matrix B - transposed from A
        System.out.println("Matrix transposed from A ");
        for (int[] x : b) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }


        scanner.close();
    }
}
