package StreamsFilesAndDirectories.Ex;

import java.io.*;
import java.util.Scanner;

public class AllCapitals {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "D:\\softuni\\JavaAdvanced\\JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        Scanner scanner = new Scanner(new FileInputStream(path));

        PrintWriter out = new PrintWriter(new FileOutputStream("exerciseOutput.txt"));
        while (scanner.hasNextLine()){
            String nextWord = scanner.nextLine();
            for (char symbol : nextWord.toCharArray()){
                if (Character.isAlphabetic(symbol)){
                    char newUpperSymbol = Character.toUpperCase(symbol);
                    out.print(newUpperSymbol);
                } else {
                    out.print(symbol);
                }
            }
            out.println();
        }

        out.flush();
    }
}
