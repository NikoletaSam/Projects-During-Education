package FinalExamPreparation4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "(?<symbol>@|#)(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        Map<String, String> mirrorWords = new LinkedHashMap<>();
        int validCounter = 0;

        while (matcher.find()){
            validCounter++;

            StringBuilder firstWord = new StringBuilder(matcher.group("firstWord"));
            StringBuilder secondWord = new StringBuilder(matcher.group("secondWord"));

            String firstReversed = firstWord.reverse().toString();
            if (firstReversed.equals(secondWord.toString())){
                String first = matcher.group("firstWord");
                String second = matcher.group("secondWord");

                mirrorWords.put(first, second);
            }
        }

        if (validCounter == 0){
            System.out.println("No word pairs found!");
        } else {
            System.out.println(validCounter + " word pairs found!");
        }

        if (mirrorWords.isEmpty()){
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            String output = mirrorWords
                    .entrySet().toString()
                    .replace("=", " <=> ")
                    .replaceAll("\\n", ", ")
                    .replace("[", "")
                    .replace("]", "");
            System.out.println(output);
        }
    }
}
