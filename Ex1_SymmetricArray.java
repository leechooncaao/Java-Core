import java.util.Scanner;

public class Ex1_SymmetricArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the length of sequence
        int n;
        System.out.println("Enter length of sequence : ");
        n = Integer.parseInt(scanner.nextLine());

        // Input the elements of sequence
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter positive integer : ");
            a[i] = scanner.nextInt();
            if (a[i] < 0) {
                System.out.println("System error !");
                break;
            }
        }
        scanner.close();

        // Show the sequence
        System.out.println("Your entered sequence : ");
        for (int x : a) {
            System.out.print(x + " ");
        }

        // Check Symmetry of sequence
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == a[n - i - 1]) check = true;
            else check = false;
        }
        if (check == true) System.out.println("\nYour entered sequence is symmetrical !");
        else System.out.println("\nYour entered sequence is not symmetrical !");

    }
}
