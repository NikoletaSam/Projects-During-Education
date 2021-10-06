package FunctionalProgramming.Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boundNum = Integer.parseInt(scanner.nextLine());

        List<Integer> numbersForDivision = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= boundNum; i++) {
            numbers.add(i);
        }

        BiFunction<Integer, Integer, Boolean> isDivisible = (firstNum, secondNum) -> {
            return firstNum % secondNum == 0;
        };

        boolean flag = true;
        for (int firstNumber : numbers){
            for (int secondNumber : numbersForDivision){
                if (!isDivisible.apply(firstNumber, secondNumber)){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.print(firstNumber + " ");
            }
            flag = true;
        }
    }
}
