package FirstStepsInCoding.ex;
import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        int kgVegetables = Integer.parseInt(scanner.nextLine());
        int kgFruits = Integer.parseInt(scanner.nextLine());

        double sumVegetablesInLv = priceVegetables * kgVegetables;
        double sumFruitsInLv = priceFruits * kgFruits;
        double totalSumInLv = sumFruitsInLv + sumVegetablesInLv;
        double totalSumInEuro = totalSumInLv / 1.94;

        System.out.printf("%.2f", totalSumInEuro);
    }
}
