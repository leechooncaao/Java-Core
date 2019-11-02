import java.util.Arrays;
import java.util.Scanner;

public class Ex2_EnumerationArray {
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
        System.out.println();

        // Count frequencies of element in array
        boolean[] booleans = new boolean[n];
        Arrays.fill(booleans, false);
        int Cmax = 0;
        int Nmax = 0;
        for (int i = 0; i < n; i++) {
            if (booleans[i] == true) continue;

            int count = 1;
            for (int j = i + 1; j <n; j++) {
                if(a[i]==a[j]){
                    booleans[j] = true;
                    count++;
                }
            }

            if(count>=Cmax){
                Cmax = count;
                Nmax = a[i];
            }
        }

        System.out.println("Element and its maximum frequences: "+Nmax+" ; "+Cmax);

    }
}
