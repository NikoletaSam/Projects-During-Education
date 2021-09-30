package StreamsFilesAndDirectories.Lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;

public class NestedFolder {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "D:\\softuni\\JavaAdvanced\\JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";
        PrintWriter out = new PrintWriter(new FileOutputStream("copyBytesOutput.txt"));

        File file = new File(path);
        ArrayDeque<File> directories = new ArrayDeque<>();
        directories.offer(file);
        out.println(file.getName());

        int counterFolders = 1;
        while (!directories.isEmpty()){
            File current = directories.poll();
            File[] allCurrentFiles = current.listFiles();
            for (File element : allCurrentFiles){
                if (element.isDirectory()){
                    out.println(element.getName());
                    directories.offer(element);
                    counterFolders++;
                }
            }

        }
        out.println(counterFolders + " folders");
        out.flush();
    }
}
