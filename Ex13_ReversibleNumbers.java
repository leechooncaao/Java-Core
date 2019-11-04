import java.util.Scanner;

public class Ex13_ReversibleNumbers {

    public static boolean checkReversion(String number){
        for (int i = 0; i <number.length() ; i++) {
            if(number.charAt(i) != number.charAt(number.length()-1 - i)) return false;
        }
       return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number;
        System.out.println("Enter a number : ");
        number = scanner.nextLine();
        if(checkReversion(number)){
            System.out.println("The number is reversible !");
        }else System.out.println("The number is not reversible !");

    }
}
