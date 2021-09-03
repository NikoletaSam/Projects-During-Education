package ConditionalsWhile.more;
import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int money = Integer.parseInt(scanner.nextLine());
        int totalMoney = 0;
        int cashCounter = 0;
        int cardCounter = 0;
        double cashMoney = 0;
        double cardMoney = 0;
        int counter = 0;

        while (totalMoney < money){
            String typeOfPayment = scanner.nextLine();
            if (typeOfPayment.equals("End")){
                break;
            } else {
                int moneyPerPayment = Integer.parseInt(typeOfPayment);
                counter++;
                if (counter % 2 != 0){
                    if ( moneyPerPayment > 100){
                        System.out.println("Error in transaction!");
                    } else {
                        cashMoney += moneyPerPayment;
                        cashCounter++;
                        totalMoney += moneyPerPayment;
                        System.out.println("Product sold!");
                    }
                } else {
                    if (moneyPerPayment < 10){
                        System.out.println("Error in transaction!");
                    } else {
                        cardMoney += moneyPerPayment;
                        cardCounter++;
                        totalMoney += moneyPerPayment;
                        System.out.println("Product sold!");
                    }
                }
            }
        }

        if (totalMoney >= money){
            double averageCash = cashMoney / cashCounter;
            double averageCard = cardMoney / cardCounter;
            System.out.printf("Average CS: %.2f %n", averageCash);
            System.out.printf("Average CC: %.2f %n", averageCard);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
