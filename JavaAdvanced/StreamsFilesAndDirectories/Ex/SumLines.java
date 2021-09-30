package StreamsFilesAndDirectories.Ex;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class SumLines {
    public static void main(String[] args) throws IOException {
        String path = "D:\\softuni\\JavaAdvanced\\JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(path));

        PrintWriter out = new PrintWriter(new FileOutputStream("exerciseOutput.txt"));
        int sumBytes = 0;

        String line = reader.readLine();
        while (line != null){
            for (char current : line.toCharArray()){
                sumBytes += current;
            }
            out.println(sumBytes);
            sumBytes = 0;

            line = reader.readLine();
        }

        out.flush();
    }
}
