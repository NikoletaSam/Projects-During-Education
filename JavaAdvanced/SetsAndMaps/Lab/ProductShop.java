package SetsAndMaps.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Double>> shops = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Revision")){
            String store = input.split(",\\s+")[0];
            String product = input.split(",\\s+")[1];
            double price = Double.parseDouble(input.split(",\\s+")[2]);

            shops.putIfAbsent(store, new LinkedHashMap<>());
            shops.get(store).put(product, price);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Double>> entry : shops.entrySet()){
            System.out.println(entry.getKey() + "->");
            for (Map.Entry<String, Double> product : entry.getValue().entrySet()){
                System.out.printf("Product: %s, Price: %.1f%n", product.getKey(), product.getValue());
            }
        }
    }
}
