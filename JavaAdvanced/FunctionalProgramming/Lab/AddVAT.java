package FunctionalProgramming.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<String, Double> toDouble = Double::parseDouble;
        UnaryOperator<Double> addVat = num -> num += num * 0.2;
        String[] input = scanner.nextLine().split(",\\s+");

        List<Double> numbers = new ArrayList<>();
        for (String current : input){
            double num = toDouble.apply(current);
            numbers.add(num);
        }

        System.out.println("Prices with VAT:");
        numbers.forEach(e -> System.out.printf("%.2f%n", addVat.apply(e)));
    }
}
