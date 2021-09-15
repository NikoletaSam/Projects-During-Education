package LectureMethods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int numberOfProducts = Integer.parseInt(scanner.nextLine());
        IsProductCoffee(product, numberOfProducts);
        IsProductWater(product, numberOfProducts);
        IsProductCoke(product, numberOfProducts);
        IsProductSnacks(product, numberOfProducts);
    }

    private static void IsProductSnacks(String product, int numberOfProducts) {
        if (product.equals("snacks")){
            double totalPrice = numberOfProducts * 2.00;
            System.out.printf("%.2f", totalPrice);
        }
    }

    private static void IsProductCoke(String product, int numberOfProducts) {
        if (product.equals("coke")){
            double totalPrice = numberOfProducts * 1.40;
            System.out.printf("%.2f", totalPrice);
        }
    }

    private static void IsProductWater(String product, int numberOfProducts) {
        if (product.equals("water")){
            double totalPrice = numberOfProducts * 1.00;
            System.out.printf("%.2f", totalPrice);
        }
    }

    private static void IsProductCoffee(String product, int numberOfProducts) {
        if (product.equals("coffee")){
            double totalPrice = numberOfProducts * 1.50;
            System.out.printf("%.2f", totalPrice);
        }
    }
}
