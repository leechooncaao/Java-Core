import java.util.Arrays;
import java.util.Scanner;

public class Ex6_InsertElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initializing array A
        int n;
        System.out.println("Enter the length of array A");
        n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        scanner.nextLine();

        int x;
        System.out.println("Enter X : ");
        x = Integer.parseInt(scanner.nextLine());

        Arrays.sort(a);

        // Initializing a new array with length n +1
        int[] b = new int[n + 1];
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] <= x && x <= a[i + 1]) {
                index = i + 1;
                break;
            }
        }
        System.out.println(index);
        for (int i = 0; i < index; i++) {
            b[i] = a[i];
        }
        b[index] = x;
        for (int i = index; i < n; i++) {
            b[++index] = a[i];
        }

        //Printing array A and the result // test
        System.out.println("Array A before inserting X : ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Array A after inserting X : ");
        for (int i : b) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
