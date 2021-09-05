package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arrayString = input.split(" ");
        int[] numbers = Arrays.stream(arrayString).mapToInt(Integer::parseInt).toArray();

        int length = 1;
        int maxLength = 0;
        int starter = 0;
        int bestStarterIndex = 0;
        for (int i = 1; i <= numbers.length - 1; i++) {
            if (numbers[i] == numbers[i - 1]) {
                length++;
            } else {
                length = 1;
                starter = i;
            }
            if (length > maxLength) {
                maxLength = length;
                bestStarterIndex = starter;
            }
        }
        for (int i = bestStarterIndex; i < bestStarterIndex + maxLength; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
