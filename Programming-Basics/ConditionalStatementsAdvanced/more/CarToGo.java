package ConditionalStatementsAdvanced.more;
import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double priceCabrio = 0.0;
        double priceJeep = 0.0;

        switch (season){
            case "Summer":
                if (budget <= 100){
                    priceCabrio = 0.35 * budget;
                    System.out.println("Economy class");
                    System.out.printf("Cabrio - %.2f", priceCabrio);
                } else if (budget <= 500){
                    priceCabrio = 0.45 * budget;
                    System.out.println("Compact class");
                    System.out.printf("Cabrio - %.2f", priceCabrio);
                } else {
                    priceJeep = 0.90 * budget;
                    System.out.println("Luxury class");
                    System.out.printf("Jeep - %.2f", priceJeep);
                }
                break;
            case "Winter":
                if (budget <= 100){
                    priceJeep = 0.65 * budget;
                    System.out.println("Economy class");
                    System.out.printf("Jeep - %.2f", priceJeep);
                } else if (budget <= 500){
                    priceJeep = 0.80 * budget;
                    System.out.println("Compact class");
                    System.out.printf("Jeep - %.2f", priceJeep);
                } else {
                    priceJeep = 0.90 * budget;
                    System.out.println("Luxury class");
                    System.out.printf("Jeep - %.2f", priceJeep);
                }
                break;
        }
    }
}
