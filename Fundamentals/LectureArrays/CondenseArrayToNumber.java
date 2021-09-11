package LectureArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int newNumber = 0;
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int[] numbers = Arrays.stream(array).mapToInt(elements -> Integer.parseInt(elements)).toArray();
        int[] condense = new int[numbers.length - 1];

        if(numbers.length > 1){
            for (int i = 0; i < numbers.length - 1; i++) {
                newNumber = numbers[i] + numbers[i+1];
                condense[i] = newNumber;
            }
            int counter = condense.length;
            while (counter > 1){
                for (int i = 0; i < condense.length - 1; i++) {
                    newNumber = condense[i] + condense[i+1];
                    condense[i] = newNumber;
                }
                counter--;
            }
            System.out.println(condense[0]);
        } else {
            System.out.println(numbers[0]);
        }
    }
}
