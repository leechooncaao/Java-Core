import java.util.Scanner;

public class Ex16_TheLongestWordInTheString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Enter a string : ");
        str = scanner.nextLine();

        // initializing new array of strings separated from former string
        String[] separation = str.split(" ");
        int index = 0;
        int maxLength = 0;
        for (int i = 0; i < separation.length; i++) {
            int len = separation[i].length();
            if (len > maxLength) {
                maxLength = len;
                index = i;
            }
        }
        System.out.println("The longest word in string : " + separation[index] +
                "\nits location : " + index + "\nits length : " + maxLength);

        scanner.close();
    }
}
