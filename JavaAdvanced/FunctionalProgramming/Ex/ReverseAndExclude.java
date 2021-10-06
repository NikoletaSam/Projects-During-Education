package FunctionalProgramming.Ex;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int numToDivide = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> isDivisible = num -> num % numToDivide != 0;

        Collections.reverse(numbers);

        numbers
                .stream()
                .filter(isDivisible)
                .forEach(num -> System.out.print(num + " "));
    }
}
