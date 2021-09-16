package LectureTextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arrayBannedWords = input.split(", ");
        String text = scanner.nextLine();

        for (String word : arrayBannedWords){
            while (text.contains(word)){
                int length = word.length();
                String replacement = "*".repeat(length);
                text = text.replace(word, replacement);
            }
        }

        System.out.println(text);
    }
}
