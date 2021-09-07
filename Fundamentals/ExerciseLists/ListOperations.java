package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] command = input.split("\\s+");
            switch (command[0]){
                case "Add":
                    int numberToAdd = Integer.parseInt(command[1]);
                    AddNumberAtTheEnd(numbers, numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(command[1]);
                    int indexToInsert = Integer.parseInt(command[2]);
                    if (indexToInsert >= 0 && indexToInsert < numbers.size()){
                        InsertNumber(numbers, numberToInsert, indexToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(command[1]);
                    if (indexToRemove >= 0 && indexToRemove < numbers.size()){
                        RemoveIndex(numbers, indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    if (command[1].equals("left")){
                        int shiftingIndex = Integer.parseInt(command[2]);
                        ShiftNumbersLeft(numbers, shiftingIndex);
                    } else {
                        int shiftingRightIndex = Integer.parseInt(command[2]);
                        ShitNumbersRight(numbers, shiftingRightIndex);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        String output = "";
        for (int element : numbers){
            output += element + " ";
        }
        System.out.println(output);
    }

    private static void ShitNumbersRight(List<Integer> numbers, int shiftingRightIndex) {
        for (int i = 1; i <= shiftingRightIndex; i++) {
            int lastNumber = numbers.get(numbers.size() - 1);
            for (int j = numbers.size() - 1; j >= 0; j--) {
                if (j != 0){
                    numbers.set(j, numbers.get(j - 1));
                } else {
                    numbers.set(0, lastNumber);
                }
            }
        }
    }

    private static void ShiftNumbersLeft(List<Integer> numbers, int shiftingIndex) {
        for (int i = 1; i <= shiftingIndex; i++) {
            int firstNumber = numbers.get(0);
            for (int j = 0; j < numbers.size(); j++) {
                if (j != (numbers.size() - 1)){
                    numbers.set(j, numbers.get(j + 1));
                } else if (j == numbers.size() - 1){
                    numbers.set(numbers.size() - 1, firstNumber);
                }
            }
        }
    }

    private static void RemoveIndex(List<Integer> numbers, int indexToRemove) {
        numbers.remove(indexToRemove);
    }

    private static void InsertNumber(List<Integer> numbers, int numberToInsert, int indexToInsert) {
        numbers.add(indexToInsert, numberToInsert);
    }

    private static void AddNumberAtTheEnd(List<Integer> numbers, int numberToAdd) {
        numbers.add(numberToAdd);
    }
}
