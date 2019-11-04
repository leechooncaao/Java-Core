import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Ex19_SeparationWords {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("Ex19.txt"), "UTF-8");
        PrintWriter printWriter = new PrintWriter("OUTPUT.txt", "UTF-8");

        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();
            word = word.trim();
            String[] words = word.split(" ");
            Arrays.sort(words);
            for (String i : words) {
                printWriter.print(i + " ");
            }
            printWriter.println();
        }

        scanner.close();
        printWriter.close();
    }
}
