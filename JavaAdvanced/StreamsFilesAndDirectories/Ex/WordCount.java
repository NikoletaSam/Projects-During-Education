package StreamsFilesAndDirectories.Ex;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws IOException {
        String path = "D:\\softuni\\JavaAdvanced\\JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        Scanner firstScanner = new Scanner(new FileInputStream(path));
        Map<String, Integer> wordsCounter = new LinkedHashMap<>();

        while (firstScanner.hasNextLine()){
            String[] element = firstScanner.nextLine().split("\\s+");
            for (String word : element){
                wordsCounter.put(word, 0);
            }
        }

        String secondPath = "D:\\softuni\\JavaAdvanced\\JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        Scanner scanner = new Scanner(new FileInputStream(secondPath));

        PrintWriter out = new PrintWriter(new FileOutputStream("exerciseOutput.txt"));
        while (scanner.hasNextLine()){
            for (String word : scanner.nextLine().split("\\s+")){
                if (wordsCounter.containsKey(word)){
                    int currentRepetition = wordsCounter.get(word);
                    wordsCounter.put(word, currentRepetition + 1);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : wordsCounter.entrySet()){
            out.println(entry.getKey() + " - " + entry.getValue());
        }
        out.flush();
    }
}
