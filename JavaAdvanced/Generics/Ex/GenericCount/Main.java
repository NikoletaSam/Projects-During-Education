package Generics.Ex.GenericCount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Counter<Double> elements = new Counter<>();

        int numOfInputs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfInputs; i++) {
            Double currentInput = Double.parseDouble(scanner.nextLine());
            elements.add(currentInput);
        }

        Double toCompare = Double.parseDouble(scanner.nextLine());
        System.out.println(elements.getBigger(toCompare));
    }
}
