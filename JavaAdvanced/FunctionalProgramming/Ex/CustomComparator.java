package FunctionalProgramming.Ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Comparator<Integer> comparator = (first, second) -> {
            if (first % 2 == 0 && second % 2 != 0){
                return -1;
            } else if (first % 2 != 0 && second % 2 == 0){
                return 1;
            } else {
                return first.compareTo(second);
            }
        };

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).sorted(comparator).collect(Collectors.toList());

        numbers.forEach(e -> System.out.print(e + " "));
    }
}
