import java.util.Scanner;

public class Ex12_ConvertBase {

    public static final String BASE = "0123456789ABCDEFGHIJKLMNOPQRSTUVXYZW";

    private static String convert(int number, int base) {
        StringBuilder stringBuilder = new StringBuilder();
        int x = 0;
        while (number > 0) {
            x = number % base;
            number /= base;
            stringBuilder.append(BASE.charAt(x));
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, base;
        System.out.println("Enter a natural number in decimal base and base converting [2 - 36] : ");
        number = scanner.nextInt();
        base = scanner.nextInt();

        System.out.print("The new number in corresponding base : " + convert(number, base));


        scanner.close();
    }

}
