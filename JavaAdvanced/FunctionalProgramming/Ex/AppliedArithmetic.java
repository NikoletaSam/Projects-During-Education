package FunctionalProgramming.Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Function<Integer, Integer> add = num -> num += 1;
        Function<Integer, Integer> multiply = num -> num *= 2;
        Function<Integer, Integer> subtract = num -> num -= 1;

        String input = scanner.nextLine();
        while (!input.equals("end")){
            switch (input){
                case "add":
                    numbers = numbers.stream().map(add).collect(Collectors.toList());
                    break;
                case "multiply":
                    numbers = numbers.stream().map(multiply).collect(Collectors.toList());
                    break;
                case "subtract":
                    numbers = numbers.stream().map(subtract).collect(Collectors.toList());
                    break;
                case "print":
                    numbers.forEach(num -> System.out.print(num + " "));
                    System.out.println();
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
