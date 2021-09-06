package ExerciseAssociativeArrays;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> productsInformation = new LinkedHashMap<>();
        Map<String, List<Double>> info = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")){
            String[] array = input.split("\\s+");
            String product = array[0];
            double price = Double.parseDouble(array[1]);
            double quantity = Double.parseDouble(array[2]);
            if (productsInformation.containsKey(product)){
                info.get(product).set(0, price);
                double previousQuantity = info.get(product).get(1);
                info.get(product).set(1, previousQuantity + quantity);
                double newInformation = info.get(product).get(0) * (previousQuantity + quantity);
                productsInformation.put(product, newInformation);
            }
            productsInformation.putIfAbsent(product, price * quantity);
            info.putIfAbsent(product, new ArrayList<>(Arrays.asList(price, quantity)));

            input = scanner.nextLine();
        }

        productsInformation
                .forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value));
    }
}
