import java.util.Arrays;
import java.util.Scanner;

public class Ex3_PrimesInArray {
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
        scanner.nextLine();

        // Show the sequence
        System.out.println("Your entered sequence : ");
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();

        // Find the prime - its closest value from X
        int x;
        int index = -1;
        int min = Integer.MAX_VALUE;
        System.out.println("Enter X : ");
        x = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < n; i++) {
            int currentMin = getMin(x,a[i]);
            if(checkPrime(a[i]) && currentMin < min){
                min = currentMin;
                index = i;
            }
        }

        // Print the result on screen
        if(index != -1){
            System.out.println("Index of satisfied element : "+index+" and value of that element : "+a[index]);
        }
        else System.out.println("There is no existence of satisfied element !");

    }
    // get Minimum of 2 numbers
    public static int getMin(int x, int y) {
        return Math.abs(x - y);
    }

    // check prime
    public static boolean checkPrime(int x) {
        if (x == 1) return true;
        if (x == 0) return false;
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) count++;
        }
        if (count == 2) return true;
        else return false;
    }

}
