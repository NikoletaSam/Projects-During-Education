package FunctionalProgramming.Ex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> printer = word -> System.out.println("Sir " + word);
        String[] names = scanner.nextLine().split("\\s+");

        Arrays.stream(names).forEach(printer);
    }
}
