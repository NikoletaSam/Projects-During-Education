package StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        String path = "D:\\softuni\\JavaAdvanced\\JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(path);

        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

        Set<Character> symbols = Set.of(',', '.', '!', '?');
        int oneByte = fileInputStream.read();

        while (oneByte >= 0){
            if (!symbols.contains((char)oneByte)){
                fileOutputStream.write(oneByte);
            }
            oneByte = fileInputStream.read();
        }
    }
}
