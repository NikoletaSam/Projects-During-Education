package ConditionalStatementsAdvanced.lab;
import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double priceFlowers = magnolias * 3.25 + hyacinths * 4.0 + roses * 3.50 + cactus * 8;
        double totalIncome = priceFlowers - priceFlowers * 0.05;

        if (totalIncome >= giftPrice){
            double moneyLeft = Math.floor(totalIncome - giftPrice);
            System.out.printf("She is left with %.0f leva.", moneyLeft);
        } else {
            double moneyMore = Math.ceil(giftPrice - totalIncome);
            System.out.printf("She will have to borrow %.0f leva.", moneyMore);
        }
    }
}
