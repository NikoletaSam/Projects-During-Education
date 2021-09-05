package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arrayString = input.split(" ");
        int[] numbers = Arrays.stream(arrayString).mapToInt(element -> Integer.parseInt(element)).toArray();
        int numOfRotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numOfRotations; i++) {
            int savedNum = numbers[0];
            for (int j = 0; j <= numbers.length - 1; j++) {
                if (j != numbers.length - 1){
                    numbers[j] = numbers[j+1];
                } else {
                    numbers[numbers.length - 1] = savedNum;
                }
            }
        }

        for (int element : numbers){
            System.out.print(element + " ");
        }
    }
}
