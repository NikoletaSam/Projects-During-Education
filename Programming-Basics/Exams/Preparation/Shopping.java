package Exams.Preparation;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = videoCards * 250;
        double processorsPrice = (0.35 * videoCardsPrice) * processors;
        double ramMemoryPrice = (0.10 * videoCardsPrice) * ramMemory;
        double totalPrice = videoCardsPrice + processorsPrice + ramMemoryPrice;

        if (videoCards > processors){
            totalPrice = totalPrice - totalPrice * 0.15;
        }

        if (budget >= totalPrice){
            double moneyLeft = budget - totalPrice;
            System.out.printf("You have %.2f leva left!", moneyLeft);
        } else {
            double moneyMore = totalPrice - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", moneyMore);
        }
    }
}
