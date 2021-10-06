package FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(",\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        numbers = numbers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(numbers.toString().replace("[", "").replace("]", ""));
        numbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(numbers.toString().replace("[", "").replace("]", ""));
    }
}
