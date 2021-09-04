package Exams.EarlyExam;
import java.util.Scanner;

public class MiningRig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int priceVideoCard = Integer.parseInt(scanner.nextLine());
        int pricePrehodnik = Integer.parseInt(scanner.nextLine());
        double priceEnergyPerVideoCardPerDay = Double.parseDouble(scanner.nextLine());
        double moneyPerCardPerDay = Double.parseDouble(scanner.nextLine());

        int totalPriceCards = 13 * priceVideoCard;
        int totalPricePrehodnik = pricePrehodnik * 13;
        int totalMoneySpent = totalPriceCards + totalPricePrehodnik + 1000;
        double incomePerCardPerDay =  moneyPerCardPerDay - priceEnergyPerVideoCardPerDay;
        double totalIncomePerDay = 13 * incomePerCardPerDay;
        double days = Math.ceil(totalMoneySpent / totalIncomePerDay);

        System.out.println(totalMoneySpent);
        System.out.printf("%.0f", days);
    }
}
