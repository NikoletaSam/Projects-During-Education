package ExerciseMethods;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int lengthOfTheInput = FindingTheLength(input);
        if (lengthOfTheInput % 2 == 0){
            char[] middleCharacters = FindingMiddleCharacters(input);
            for (char element : middleCharacters){
                System.out.print(element);
            }
        } else {
            char onlyMiddleSymbol = FindingOnlyMiddleCharacter(input);
            System.out.println(onlyMiddleSymbol);
        }
    }

    private static char FindingOnlyMiddleCharacter(String input) {
        int middle = input.length() / 2;
        return input.charAt(middle);
    }

    private static char[] FindingMiddleCharacters(String input) {
        char[] middleSymbols = new char[2];
        int firstMiddleSymbolPosition = input.length() / 2;
        int counter = 0;
        for (int i = firstMiddleSymbolPosition - 1; i <= firstMiddleSymbolPosition; i++) {
            middleSymbols[counter] = input.charAt(i);
            counter++;
        }
        return middleSymbols;
    }

    private static int FindingTheLength(String input) {
        return input.length();
    }
}
