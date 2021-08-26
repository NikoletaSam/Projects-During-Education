package FirstStepsInCoding.ex;
import java.util.Scanner;

public class FishLand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceS = Double.parseDouble(scanner.nextLine());
        double priceC = Double.parseDouble(scanner.nextLine());
        double kgP = Double.parseDouble(scanner.nextLine());
        double kgSaf = Double.parseDouble(scanner.nextLine());
        int kgShells = Integer.parseInt(scanner.nextLine());

        double priceP = priceS + priceS * 0.60;
        double priceSaf = priceC + priceC * 0.80;
        double totalPriceShells = kgShells * 7.50;
        double totalPriceP = kgP * priceP;
        double totalPriceSaf = kgSaf * priceSaf;
        double totalSum = totalPriceP + totalPriceSaf + totalPriceShells;

        System.out.printf("%.2f", totalSum);
    }
}
