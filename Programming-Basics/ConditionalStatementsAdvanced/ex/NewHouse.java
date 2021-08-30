package ConditionalStatementsAdvanced.ex;
import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int numFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (flowers){
            case "Roses":
                price = numFlowers * 5;
                if (numFlowers > 80){
                    price = price - price * 0.10;
                }
                if (budget >= price){
                    double moneyLeft = budget - price;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, flowers, moneyLeft);
                } else {
                    double moneyMore = price - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", moneyMore);
                }
                break;
            case "Dahlias":
                price = numFlowers * 3.80;
                if (numFlowers > 90){
                    price = price - price * 0.15;
                }
                if (budget >= price){
                    double moneyLeft = budget - price;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, flowers, moneyLeft);
                } else {
                    double moneyMore = price - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", moneyMore);
                }
                break;
            case "Tulips":
                price = numFlowers * 2.80;
                if (numFlowers > 80){
                    price = price - price * 0.15;
                }
                if (budget >= price){
                    double moneyLeft = budget - price;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, flowers, moneyLeft);
                } else {
                    double moneyMore = price - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", moneyMore);
                }
                break;
            case "Narcissus":
                price = numFlowers * 3;
                if (numFlowers < 120){
                    price = price + price * 0.15;
                }
                if (budget >= price){
                    double moneyLeft = budget - price;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, flowers, moneyLeft);
                } else {
                    double moneyMore = price - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", moneyMore);
                }
                break;
            case "Gladiolus":
                price = numFlowers * 2.50;
                if (numFlowers < 80){
                    price = price + price * 0.20;
                }
                if (budget >= price){
                    double moneyLeft = budget - price;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, flowers, moneyLeft);
                } else {
                    double moneyMore = price - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", moneyMore);
                }
                break;
        }
    }
}
