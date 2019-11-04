import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ex17_ManipulationOnFile {
    public static void main(String[] args) throws IOException {
        Scanner inputFromFile = new Scanner(Paths.get("F:\\java android\\Names.txt"), "UTF-8");
        PrintWriter printWriter = new PrintWriter("RESULTS.OUT", "UTF-8");

        while (inputFromFile.hasNextLine()) {
            String name = inputFromFile.nextLine();
            name = name.trim();
            String[] names = name.split(" ");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(names[names.length - 1] + " ");
            stringBuilder.append((names[0]) + " ");
            for (int i = 1; i < names.length - 1; i++) {
                if (names[i].length() != 0) {
                    stringBuilder.append(names[i] + " ");
                }
            }
            name = stringBuilder.toString();
            printWriter.append(name + "\n");
        }


        inputFromFile.close();
        printWriter.close();

    }
}
