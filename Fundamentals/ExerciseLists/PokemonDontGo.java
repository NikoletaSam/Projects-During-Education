package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int sumOfRemovedElements = 0;

        while (numbers.size() > 0){
            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index < numbers.size()){
                int sum = GetNewLineOfNumbers(numbers, index);
                sumOfRemovedElements += sum;
            } else if (index < 0){
                int sum = GetNewLineWithLessIndex(numbers, index);
                sumOfRemovedElements += sum;
            } else if (index >= numbers.size()){
                int sum = GetNewLineWithBiggerIndex(numbers, index);
                sumOfRemovedElements += sum;
            }
        }

        System.out.println(sumOfRemovedElements);
    }

    private static int GetNewLineWithBiggerIndex(List<Integer> numbers, int index) {
        int currentNumber = numbers.get(numbers.size() - 1);
        numbers.set(numbers.size() - 1, numbers.get(0));
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= currentNumber){
                numbers.set(i, numbers.get(i) + currentNumber);
            } else {
                numbers.set(i, numbers.get(i) - currentNumber);
            }
        }
        return currentNumber;
    }

    private static int GetNewLineWithLessIndex(List<Integer> numbers, int index) {
        int currentNumber = numbers.get(0);
        numbers.set(0, numbers.get(numbers.size() - 1));
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= currentNumber){
                numbers.set(i, numbers.get(i) + currentNumber);
            } else {
                numbers.set(i, numbers.get(i) - currentNumber);
            }
        }
        return currentNumber;
    }

    private static Integer GetNewLineOfNumbers(List<Integer> numbers, int index) {
        int currentNumber = numbers.get(index);
        numbers.remove(index);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= currentNumber){
                numbers.set(i, numbers.get(i) + currentNumber);
            } else {
                numbers.set(i, numbers.get(i) - currentNumber);
            }
        }
        return currentNumber;
    }
}
