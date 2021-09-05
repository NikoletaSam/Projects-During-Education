package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arrayString = input.split(" ");
        int[] numbers = Arrays.stream(arrayString).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i <= numbers.length - 1; i++) {
            boolean flag = true;
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                if (numbers[i] <= numbers[j]){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
