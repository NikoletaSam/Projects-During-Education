package ConditionalStatementsAdvanced.more;
import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();
        double priceJuniors = 0.0;
        double priceSeniors = 0.0;
        double totalSum = 0.0;

        switch (trace){
            case "trail":
               priceJuniors = juniors * 5.50;
               priceSeniors = seniors * 7;
               totalSum = priceJuniors + priceSeniors - (priceJuniors + priceSeniors) * 0.05;
               System.out.printf("%.2f", totalSum);
               break;
            case "cross-country":
                priceJuniors = juniors * 8;
                priceSeniors = seniors * 9.50;
                int totalBikers = juniors + seniors;
                if (totalBikers >= 50){
                    double sum = priceJuniors + priceSeniors - 0.25 * (priceJuniors + priceSeniors);
                    totalSum = sum - 0.05 * sum;
                } else {
                    totalSum = priceJuniors + priceSeniors - 0.05 * (priceJuniors + priceSeniors);
                }
                System.out.printf("%.2f", totalSum);
                break;
            case "downhill":
                priceJuniors = juniors * 12.25;
                priceSeniors = seniors * 13.75;
                totalSum = priceJuniors + priceSeniors - (priceJuniors + priceSeniors) * 0.05;
                System.out.printf("%.2f", totalSum);
                break;
            case "road":
                priceJuniors = juniors * 20;
                priceSeniors = seniors * 21.50;
                totalSum = priceJuniors + priceSeniors - (priceJuniors + priceSeniors) * 0.05;
                System.out.printf("%.2f", totalSum);
                break;

        }
    }
}
