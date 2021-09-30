package SetsAndMaps.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> elementsInformation = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            elementsInformation.putIfAbsent(input, 0);
            int currentQuantity = elementsInformation.get(input);
            elementsInformation.put(input, currentQuantity + quantity);

            input = scanner.nextLine();
        }

        elementsInformation
                .forEach((key, value) -> System.out.printf("%s -> %d%n", key, value));
    }
}
