package ExamPreparation3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")){
            String[] line = input.split("\\s+");
            String command = line[0];
            switch (command){
                case "swap":
                    int firstIndex = Integer.parseInt(line[1]);
                    int secondIndex = Integer.parseInt(line[2]);
                    int currentNumber = numbers.get(firstIndex);
                    numbers.set(firstIndex, numbers.get(secondIndex));
                    numbers.set(secondIndex, currentNumber);
                    break;
                case "multiply":
                    int firstIndexMultiply = Integer.parseInt(line[1]);
                    int secondIndexMultiply = Integer.parseInt(line[2]);
                    int newNumber = numbers.get(firstIndexMultiply) * numbers.get(secondIndexMultiply);
                    numbers.set(firstIndexMultiply, newNumber);
                    break;
                case "decrease":
                    DecreaseAllNumbers(numbers);
                    break;
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            int currentNum = numbers.get(i);
            System.out.print(currentNum + ", ");
        }
        System.out.print(numbers.get(numbers.size() - 1));
    }

    private static void DecreaseAllNumbers(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i) - 1;
            numbers.set(i, current);
        }
    }
}
