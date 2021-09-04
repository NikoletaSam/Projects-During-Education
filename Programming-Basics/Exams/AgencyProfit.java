package Exams;
import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int numAdultTickets = Integer.parseInt(scanner.nextLine());
        int numKidsTickets = Integer.parseInt(scanner.nextLine());
        double netPricePerAdultTicket = Double.parseDouble(scanner.nextLine());
        double priceService = Double.parseDouble(scanner.nextLine());

        double netPriceKidsTickets = 0.30 * netPricePerAdultTicket;
        double totalPrice = numAdultTickets * (netPricePerAdultTicket + priceService) + numKidsTickets * (netPriceKidsTickets + priceService);
        double income = totalPrice * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, income);
    }
}
