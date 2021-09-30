package StreamsFilesAndDirectories.Ex;

import java.io.*;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        long totalSum = 0;
        String path = "D:\\softuni\\JavaAdvanced\\JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(path));

        PrintWriter out = new PrintWriter(new FileOutputStream("exerciseOutput.txt"));

        int current = reader.read();
        while (current > -1){
            if (current != 10 && current != 13){
                totalSum += current;
            }

            current = reader.read();
        }
        out.println(totalSum);
        out.flush();
    }
}
