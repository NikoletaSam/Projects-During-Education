package ExerciseMethods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")){
            int reverseNumber = GetReverseNumber(input);
            int number = Integer.parseInt(input);
            boolean areTheTwoNumbersEqual = CompareNumberWithReversedNumber(reverseNumber,number);
            System.out.println(areTheTwoNumbersEqual);

            input = scanner.nextLine();
        }
    }

    private static boolean CompareNumberWithReversedNumber(int reverseNumber, int number) {
        return reverseNumber == number;
    }

    private static int GetReverseNumber(String input) {
        String reversedString = "";
        for (int i = input.length()-1; i >= 0; i--) {
            reversedString += input.charAt(i);
        }
        return Integer.parseInt(reversedString);
    }


}
