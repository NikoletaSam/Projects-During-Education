package FinalExamPreparation2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coolThreshold = 1;
        String input = scanner.nextLine();

        String coolnessRegex = "[\\d]";
        Pattern pattern = Pattern.compile(coolnessRegex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            coolThreshold = coolThreshold * Integer.parseInt(matcher.group());
        }
        System.out.println("Cool threshold: " + coolThreshold);

        List<String> emojis = new ArrayList<>();
        int counter = 0;

        String emojiRegex = "([:]{2}|[*]{2})(?<emojiName>[A-Z][a-z]{2,})\\1";
        Pattern emojiPattern = Pattern.compile(emojiRegex);
        Matcher emojiMatcher = emojiPattern.matcher(input);
        while (emojiMatcher.find()){
            counter++;

            String emoji = emojiMatcher.group("emojiName");
            int totalSum = 0;
            char[] array = emoji.toCharArray();
            for (char symbol : array){
                totalSum += symbol;
            }
            if (totalSum >= coolThreshold){
                emojis.add(emojiMatcher.group());
            }
        }

        System.out.println(counter + " emojis found in the text. The cool ones are:");
        for (String element : emojis){
            System.out.println(element);
        }
    }
}
