package ExerciseAssociativeArrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == ' '){
                continue;
            } else {
                if (charCount.containsKey(current)){
                    int counts = charCount.get(current);
                    counts++;
                    charCount.put(current, counts);
                }
                charCount.putIfAbsent(current, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()){
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
