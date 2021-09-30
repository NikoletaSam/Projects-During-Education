package StreamsFilesAndDirectories.Ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class LineNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "D:\\softuni\\JavaAdvanced\\JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        Scanner scanner = new Scanner(new FileInputStream(path));

        PrintWriter out = new PrintWriter(new FileOutputStream("exerciseOutput.txt"));

        int lineCounter = 1;
        while (scanner.hasNextLine()){
            out.println(lineCounter + ". " + scanner.nextLine());
            lineCounter++;
        }

        out.flush();
    }
}
