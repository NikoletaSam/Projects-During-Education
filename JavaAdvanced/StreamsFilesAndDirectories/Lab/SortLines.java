package StreamsFilesAndDirectories.Lab;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {
        String path = "D:\\softuni\\JavaAdvanced\\JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        PrintWriter out = new PrintWriter(new FileOutputStream("copyBytesOutput.txt"));

        List<String> lines = Files.readAllLines(Path.of(path));
        lines = lines.stream().sorted().collect(Collectors.toList());
        for (String line : lines){
            out.println(line);
        }

        out.flush();
    }
}
