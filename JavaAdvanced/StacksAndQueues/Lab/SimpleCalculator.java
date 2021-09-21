package StacksAndQueues.Lab;

import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> numbers = new ArrayDeque<>();
        String[] arr = scanner.nextLine().split("\\s+");

        Collections.addAll(numbers, arr);

        while (numbers.size() > 1){
            int firstNumber = Integer.parseInt(numbers.pop());
            String operator = numbers.pop();
            int secondNumber = Integer.parseInt(numbers.pop());

            int result = 0;
            if (operator.equals("+")){
                result = firstNumber + secondNumber;
            } else {
                result = firstNumber - secondNumber;
            }
            numbers.push(String.valueOf(result));
        }

        System.out.println(numbers.peek());
    }
}
