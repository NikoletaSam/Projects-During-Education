package ExerciseTextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //reads input
        String input = scanner.nextLine();
        char[] symbols = input.toCharArray();
        StringBuilder result = new StringBuilder();

        // adds the symbols which are different from the one before them
        result.append(symbols[0]);
        for (int i = 1; i < symbols.length; i++) {
            if (symbols[i] != symbols[i - 1]){
                result.append(symbols[i]);
            }
        }

        //print the new text
        System.out.println(result);
    }
}
