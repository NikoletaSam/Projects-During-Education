package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arrayString = input.split(" ");
        int[] numbers = Arrays.stream(arrayString).mapToInt(Integer::parseInt).toArray();

        int magicNum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= numbers.length - 2; i++) {
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                int sum = numbers[i] + numbers[j];
                if (sum == magicNum){
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
}
