import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex4_RandomArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize n _ length of array
        int n;
        System.out.println("Enter N : ");
        n = scanner.nextInt();
        scanner.close();

        // Initialize a random array
        int[] a = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(25);
        }

        // Print the array
        System.out.println("The random array : ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Arrange the array in ascending order
        Arrays.sort(a);
        System.out.println("The array after arrangement in ascending order : \n" + Arrays.toString(a));

        // Exclude duplicate elements in array
        int newLength = removeDuplicateElement(a, n);
        System.out.println("New array :");
        for (int i = 0; i < newLength; i++) {
            System.out.print(a[i] + " ");
        }


    }

    // Function removering duplicate element in array
    public static int removeDuplicateElement(int[] a, int n) {
        if (n == 0 | n == 1) return n;
        int[] temp = new int[n];
        int tempSize = 0;
        for (int i = 0; i < n-1; i++) {
            if (a[i] != a[i + 1]) {
                temp[tempSize++] = a[i];

            }
        }
        temp[tempSize++] = a[n - 1];
        for (int i = 0; i < tempSize; i++) {
            a[i] = temp[i];
        }
        return tempSize;
    }
}
