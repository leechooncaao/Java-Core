import java.util.Arrays;
import java.util.Scanner;

public class Ex5_InsertArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input array A
        int m;
        System.out.println("Enter length of array A : ");
        m = scanner.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        scanner.nextLine();

        // input array B
        int n;
        System.out.println("Enter length of array B : ");
        n = scanner.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("b[" + i + "] = ");
            b[i] = scanner.nextInt();
        }
        scanner.nextLine();

        int p;
        System.out.println("Enter p : ");
        p = Integer.parseInt(scanner.nextLine());

        // Initializing new array C
        int k = m + n; // length of array C
        int[] c = new int[k];

        // Add a into c from position 0 to p (not inclusive)
        for (int i = 0; i < p; i++) {
            c[i] = a[i];
        }

        // Add b into c from position p inclusive
        for (int i = 0; i < n; i++) {
            c[i + p] = b[i];
        }

        // Add the rest of a into c from position p + m
        for (int i = p; i < m; i++) {
            c[i + n] = a[i];
        }

        // Printing the arrays A , B and C
        System.out.println("The array A :");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("The array B :");
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("The result :");
        for (int i : c) {
            System.out.print(i + " ");
        }
        System.out.println();
        scanner.close();

    }
}
