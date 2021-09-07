package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        List<Character> line = input.chars().mapToObj(e->(char)e).collect(Collectors.toList());
        for (int i = 0; i < numbers.size(); i++) {
            int sumOfCurrentNumbers = 0;
            int currentNumber = numbers.get(i);
            while (currentNumber != 0){
                int digit = currentNumber % 10;
                sumOfCurrentNumbers += digit;
                currentNumber = currentNumber / 10;
            }

            int symbol = 0;
            if(sumOfCurrentNumbers >= input.length()){
                int length = input.length();
                symbol = GetLessCurrentNumberThanDigitsOfInput(sumOfCurrentNumbers, length);
            } else {
                symbol = sumOfCurrentNumbers;
            }

            char currentDigit = line.get(symbol);
            System.out.print(currentDigit);
            line.remove(symbol);
        }
    }

    private static Integer GetLessCurrentNumberThanDigitsOfInput(int sumOfCurrentNumbers, int length) {
        while (sumOfCurrentNumbers >= length){
            sumOfCurrentNumbers -= length;
        }
        return sumOfCurrentNumbers;
    }
}
