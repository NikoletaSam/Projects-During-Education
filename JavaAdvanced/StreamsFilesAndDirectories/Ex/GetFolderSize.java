package StreamsFilesAndDirectories.Ex;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetFolderSize {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "D:\\softuni\\JavaAdvanced\\JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File file = new File(path);

        PrintWriter out = new PrintWriter(new FileOutputStream("exerciseOutput.txt"));
        File[] files = file.listFiles();
        ArrayDeque<File> dirs = new ArrayDeque<>();

        int totalSize = 0;
        for (File current : files){
            if (current.isFile()){
                totalSize += current.length();
            } else {
                dirs.offer(current);
            }
        }

        while (!dirs.isEmpty()){
            File currentFile = dirs.poll();
            if (currentFile.isFile()){
                totalSize += currentFile.length();
            } else {
                dirs.offer(currentFile);
            }
        }

        out.println("Folder size: " + totalSize);
        out.flush();
    }
}
