package ExerciseTextProcessing;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] array = input.split("\\s+");

        double totalSum = 0;
        for (String word : array){
           char firstLetter = word.charAt(0);
           char lastLetter = word.charAt(word.length() - 1);
           String numString = word.substring(1, word.length() - 1);
           int number = Integer.parseInt(numString);

           //check first letter
            double result = 0;
           if (Character.isLowerCase(firstLetter)){
               int position = (int)firstLetter - 96;
               result = (position * 1.0) * number;
           } else {
               int position = (int)firstLetter - 64;
               result = (1.0 * number) / position;
           }

           //check second letter
           if (Character.isLowerCase(lastLetter)){
               int position = (int)lastLetter - 96;
               result += position;
           } else {
               int position = (int)lastLetter - 64;
               result -= position;
           }

           //add the result to the total sum
           totalSum += result;
        }

        System.out.printf("%.2f", totalSum);
    }
}
