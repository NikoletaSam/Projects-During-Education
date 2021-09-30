package StreamsFilesAndDirectories.Ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;

public class CountCharacterType {
    public static void main(String[] args) throws FileNotFoundException {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        Set<Character> punctuation = Set.of('!', ',', '.', '?');

        String path = "D:\\softuni\\JavaAdvanced\\JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        Scanner scanner = new Scanner(new FileInputStream(path));

        PrintWriter out = new PrintWriter(new FileOutputStream("exerciseOutput.txt"));

        int vowelsCount = 0;
        int consonantsCount = 0;
        int punctuationCount = 0;

        while (scanner.hasNextLine()){
            for (char next : scanner.nextLine().toCharArray()){
                if (vowels.contains(next)){
                    vowelsCount++;
                } else if (punctuation.contains(next)){
                    punctuationCount++;
                } else if (next != ' '){
                    consonantsCount++;
                }
            }
        }

        out.println("Vowels: " + vowelsCount);
        out.println("Consonants: " + consonantsCount);
        out.println("Punctuation: " + punctuationCount);

        out.flush();
    }
}
