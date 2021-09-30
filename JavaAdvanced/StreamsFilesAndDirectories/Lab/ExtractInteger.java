package StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractInteger {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "D:\\softuni\\JavaAdvanced\\JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        Scanner scanner = new Scanner(new FileInputStream(path));

        PrintWriter out = new PrintWriter(new FileOutputStream("copyBytesOutput.txt"));
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                out.println(scanner.nextInt());
            }

            scanner.next();
        }

        out.flush();
    }
}
