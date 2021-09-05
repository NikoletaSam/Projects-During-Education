package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfRows = Integer.parseInt(scanner.nextLine());
        int[] firstArrayOfNumbers = {1};
        System.out.println(firstArrayOfNumbers[0]);
        int[] lastArray = new int[2];

        for (int i = 1; i < numOfRows; i++) {
            int[] currentArrayOfNumbers = new int[i + 1];

            for (int j = 0; j <= currentArrayOfNumbers.length - 1; j++) {
                if (j == 0 || j == currentArrayOfNumbers.length - 1){
                    currentArrayOfNumbers[j] = 1;
                } else {
                    currentArrayOfNumbers[j] = lastArray[j] + lastArray[j - 1];
                }
            }
            lastArray = currentArrayOfNumbers;
            for (int elements : lastArray){
                System.out.print(elements + " ");
            }
            System.out.println();
            lastArray = Arrays.copyOf(lastArray, i + 2);
        }
    }
}
