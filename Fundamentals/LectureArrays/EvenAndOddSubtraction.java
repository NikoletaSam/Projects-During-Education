package LectureArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int[] numbers = Arrays.stream(array).mapToInt(elements -> Integer.parseInt(elements)).toArray();
        for (int eachNumber : numbers){
            if (eachNumber % 2 == 0){
                sumEvenNumbers += eachNumber;
            } else {
                sumOddNumbers += eachNumber;
            }
        }

        int subtraction = sumEvenNumbers - sumOddNumbers;
        System.out.println(subtraction);
    }
}
