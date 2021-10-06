package FunctionalProgramming.Lab;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUpperCaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.asList(scanner.nextLine().split("\\s+").clone());

        Predicate<String> isFirstLetterUppercase = word -> Character.isUpperCase(word.charAt(0));

        input = input.stream()
                .filter(isFirstLetterUppercase)
                .collect(Collectors.toList());

        if (input.size() > 0){
            System.out.println(input.size());
            input.forEach(System.out::println);
        }
    }
}
