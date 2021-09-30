package StreamsFilesAndDirectories.Ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MergeTwoFiles {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "D:\\softuni\\JavaAdvanced\\JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        Scanner firstScanner = new Scanner(new FileInputStream(path));

        String secondPath = "D:\\softuni\\JavaAdvanced\\JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        Scanner scanner = new Scanner(new FileInputStream(secondPath));

        PrintWriter out = new PrintWriter(new FileOutputStream("exerciseOutput.txt"));
        while (firstScanner.hasNextLine()){
            out.println(firstScanner.nextLine());
        }

        while (scanner.hasNextLine()){
            out.println(scanner.nextLine());
        }

        out.flush();
    }
}
