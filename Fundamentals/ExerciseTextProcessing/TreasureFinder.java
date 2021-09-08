package ExerciseTextProcessing;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] key = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();
        while (!input.equals("find")){
            StringBuilder result = new StringBuilder();

            char[] textSymbols = input.toCharArray();
            for (int i = 0; i < textSymbols.length; i++) {
                int currentKey = 0;
                if (i >= key.length){
                    int currentIndex = i;
                    while (currentIndex >= key.length){
                        currentIndex = currentIndex - key.length;
                    }
                    currentKey = key[currentIndex];
                } else {
                    currentKey = key[i];
                }

                char currentSymbol = textSymbols[i];
                char newSymbol = (char) ((int)currentSymbol - currentKey);
                result.append(newSymbol);
            }

            String type = result.substring(result.indexOf("&") + 1, result.lastIndexOf("&"));
            String location = result.substring(result.indexOf("<") + 1, result.lastIndexOf(">"));
            System.out.printf("Found %s at %s%n", type, location);

            input = scanner.nextLine();
        }
    }
}
