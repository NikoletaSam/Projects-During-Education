package ExerciseArrays;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 1 2 3 5
        int number = Integer.parseInt(scanner.nextLine());
        if (number >= 1 && number <= 50){
            int[] arrayOfNumbers = new int[number];
            arrayOfNumbers[0] = 1;
            for (int i = 1; i < number; i++) {
                if (i == 1){
                    arrayOfNumbers[i] = arrayOfNumbers[i - 1];
                } else {
                    arrayOfNumbers[i] = arrayOfNumbers[i - 1] + arrayOfNumbers[i - 2];
                }
            }
            System.out.println(arrayOfNumbers[number - 1]);
        }
    }
}
