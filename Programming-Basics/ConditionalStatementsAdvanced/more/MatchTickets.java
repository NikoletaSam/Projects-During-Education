package ConditionalStatementsAdvanced.more;
import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String ticketType = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double transportMoney = 0.0;
        double totalMoney = 0.0;

        if (people <= 4){
            transportMoney = 0.75 * budget;
        } else if (people <= 9){
            transportMoney = 0.60  * budget;
        } else if (people <= 24){
            transportMoney = 0.50 * budget;
        } else if (people <= 49){
            transportMoney = 0.40 * budget;
        } else {
            transportMoney = 0.25 * budget;
        }
        switch (ticketType){
            case "VIP":
                totalMoney = transportMoney + 499.99 * people;
                if (totalMoney <= budget){
                    double moneyLeft = budget - totalMoney;
                    System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                } else {
                    double moneyMore = totalMoney - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", moneyMore);
                }
                break;
            case "Normal":
                totalMoney = transportMoney + 249.99 * people;
                if (totalMoney <= budget){
                    double leftMoney = budget - totalMoney;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else {
                    double moreMoney = totalMoney - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", moreMoney);
                }
                break;
        }
    }
}
