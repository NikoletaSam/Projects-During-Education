package ConditionalStatementsAdvanced.ex;
import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (season){
            case "Spring":
                if (fishers <= 6){
                    price = 3000 - 3000 * 0.10;
                } else if (fishers <= 11){
                    price = 3000 - 3000 * 0.15;
                } else {
                    price = 3000 - 3000 * 0.25;
                }
                if ( fishers % 2 == 0){
                    price = price - price * 0.05;
                }
                if (budget >= price){
                    double moneyLeft = budget - price;
                    System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                } else {
                    double moneyMore = price - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", moneyMore);
                }
                break;
            case "Summer":
                if (fishers <= 6){
                    price = 4200 - 4200 * 0.10;
                } else if (fishers <= 11){
                    price = 4200 - 4200 * 0.15;
                } else {
                    price = 4200 - 4200 * 0.25;
                }
                if ( fishers % 2 == 0){
                    price = price - price * 0.05;
                }
                if (budget >= price){
                    double moneyLeft = budget - price;
                    System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                } else {
                    double moneyMore = price - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", moneyMore);
                }
                break;
            case "Autumn":
                if (fishers <= 6){
                    price = 4200 - 4200 * 0.10;
                } else if (fishers <= 11){
                    price = 4200 - 4200 * 0.15;
                } else {
                    price = 4200 - 4200 * 0.25;
                }
                if (budget >= price){
                    double moneyLeft = budget - price;
                    System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                } else {
                    double moneyMore = price - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", moneyMore);
                }
                break;
            case "Winter":
                if (fishers <= 6){
                    price = 2600 - 2600 * 0.10;
                } else if (fishers <= 11){
                    price = 2600 - 2600 * 0.15;
                } else {
                    price = 2600 - 2600 * 0.25;
                }
                if ( fishers % 2 == 0){
                    price = price - price * 0.05;
                }
                if (budget >= price){
                    double moneyLeft = budget - price;
                    System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                } else {
                    double moneyMore = price - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", moneyMore);
                }
                break;
        }
    }
}
