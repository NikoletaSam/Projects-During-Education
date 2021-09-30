package StreamsFilesAndDirectories.Lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ListFiles {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "D:\\softuni\\JavaAdvanced\\JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";
        PrintWriter out = new PrintWriter(new FileOutputStream("copyBytesOutput.txt"));

        File file = new File(path);
        File[] filesArr = file.listFiles();

        assert filesArr != null;
        for (File currentFile : filesArr){
            if (currentFile.isFile()){
                out.println(currentFile.getName() + ": [" + currentFile.length() + "]");
            }
        }

        out.flush();
    }
}
