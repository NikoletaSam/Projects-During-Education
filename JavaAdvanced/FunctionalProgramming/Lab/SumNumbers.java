package FunctionalProgramming.Lab;

import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",\\s+");

        Function<String, Integer> countSum = Integer::parseInt;
        int totalSum = 0;
        for (String num : input){
            totalSum += countSum.apply(num);
        }

        System.out.println("Count = " + input.length);
        System.out.println("Sum = " + totalSum);
    }
}
