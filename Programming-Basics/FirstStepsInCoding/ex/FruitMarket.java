package FirstStepsInCoding.ex;
import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        double priceStrawberries = Double.parseDouble(scanner.nextLine());
        double kgBananas = Double.parseDouble(scanner.nextLine());
        double kgOranges = Double.parseDouble(scanner.nextLine());
        double kgRaspberries = Double.parseDouble(scanner.nextLine());
        double kgStrawberries = Double.parseDouble(scanner.nextLine());

        double priceRaspberries = priceStrawberries * 0.5;
        double priceOranges = priceRaspberries * 0.6;
        double priceBananas = priceRaspberries * 0.2;

        double sumStrawberries = priceStrawberries * kgStrawberries;
        double sumRaspberries = priceRaspberries * kgRaspberries;
        double sumBananas = priceBananas * kgBananas;
        double sumOranges = priceOranges * kgOranges;
        double totalSum = sumBananas + sumOranges + sumRaspberries + sumStrawberries;

        System.out.printf("%.2f", totalSum);
    }
}
