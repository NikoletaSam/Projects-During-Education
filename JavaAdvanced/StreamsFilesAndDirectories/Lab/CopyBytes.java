package StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        String path = "D:\\softuni\\JavaAdvanced\\JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(path);

        FileOutputStream fileOutputStream = new FileOutputStream("copyBytesOutput.txt");

        int oneByte = fileInputStream.read();
        while (oneByte > -1){
            String digits = String.valueOf(oneByte);
            if (!digits.equals("32") && !digits.equals("10")) {
                for (int i = 0; i < digits.length(); i++) {
                    fileOutputStream.write(digits.charAt(i));
                }
            } else {
                fileOutputStream.write((char)oneByte);
            }


            oneByte = fileInputStream.read();
        }
    }
}
