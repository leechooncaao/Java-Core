import java.util.Scanner;

public class Ex9_MultiplicationArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m,n,k;
        int[][] a,b,c;

        System.out.println("Enter numbers of rows and columns of matrix A");
        m = scanner.nextInt();
        n = scanner.nextInt();
//        int[][]a = new int[m][n];
        a = inputArray(m,n,scanner);

        System.out.println("Enter numbers of rows and columns of matrix B");
        n = scanner.nextInt();
        k = scanner.nextInt();
//        int[][]b = new int[g][k];
        b = inputArray(n,k,scanner);

//        int[][]c = new int[m][k];
        c = multiplization(a,b);

        System.out.println("Matrix A : ");
        show(a);
        System.out.println("Matrix B : ");
        show(b);
        System.out.println("The result of multiplying A and B : ");
        show(c);

        scanner.close();


    }

    // Function initializing matrix
    private static int[][] inputArray(int m, int n, Scanner scanner) {
        int[][] x = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("x[" + i + "][" + j + "] = ");
                x[i][j]=scanner.nextInt();
            }
            System.out.println();
        }
        scanner.nextLine();
//        scanner.close();
        return x;
    }

    // Function printing matrix
    private static void show(int[][] x) {
        int m = x.length;
        int n = x[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(" %5d",x[i][j]);
            }
            System.out.println();
        }
    }

    //Function multiplizing 2 matrix
    private static int[][] multiplization(int[][] x, int[][] y) {
        int m = x.length;
        int n = y[0].length;
        int k = x[0].length;
        int[][] z = new int[x.length][y[0].length];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < k; l++) {
                    z[i][j] += x[i][l] * y[l][j];
                }
            }
        }
        return z;

    }
}
