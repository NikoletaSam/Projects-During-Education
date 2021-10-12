package Generics.Ex.GenericSwap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SwapBox<Integer> elements = new SwapBox<>();

        int numOfInputs = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numOfInputs; i++) {
            String input = scanner.nextLine();
            Integer currentElement = Integer.parseInt(input);
            elements.add(currentElement);
        }

        int firstIndex = scanner.nextInt();
        int secondIndex = scanner.nextInt();
        elements.swap(firstIndex, secondIndex);
        System.out.print(elements);
    }
}
