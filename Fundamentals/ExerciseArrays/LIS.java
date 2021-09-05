package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class LIS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int[] lineOfNumbers = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();
        int lengthOfSequence = 1;
        int currentDigit = 0;

        for (int i = 0; i <= lineOfNumbers.length - 2; i++) {
            if (lineOfNumbers[i] < lineOfNumbers[i + 1]){
                lengthOfSequence++;
            }
        }
        int[] sequence = new int[lengthOfSequence];
        if (lineOfNumbers.length == 1){
            sequence = lineOfNumbers;
        }
        for (int i = 0; i <= lineOfNumbers.length - 2; i++) {
            if (lineOfNumbers[i] < lineOfNumbers[i + 1]){
                currentDigit = lineOfNumbers[i];
            }

            for (int j = 0; j <= lengthOfSequence - 1; j++) {
                sequence[j] = currentDigit;
            }
        }
        for (int elements : sequence){
            System.out.print(elements + " ");
        }
    }
}
