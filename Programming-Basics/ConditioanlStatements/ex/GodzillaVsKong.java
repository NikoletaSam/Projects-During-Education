package ConditioanlStatements.ex;
import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numStatists = Integer.parseInt(scanner.nextLine());
        double priceClothingPerStatist = Double.parseDouble(scanner.nextLine());

        double decor = 0.10 * budget;
        double priceClothing = numStatists * priceClothingPerStatist;
        if(numStatists > 150){
            priceClothing = priceClothing - 0.10 * priceClothing;
        }

        double moneyNeeded = decor + priceClothing;
        if(moneyNeeded > budget){
            double moneyMore = moneyNeeded - budget;
            System.out.println("Not enough money!");
            System.out.print("Wingard needs ");
            System.out.printf("%.2f", moneyMore);
            System.out.print(" leva more.");
        }else {
            double moneyLeft = budget - moneyNeeded;
            System.out.println("Action!");
            System.out.print("Wingard starts filming with ");
            System.out.printf("%.2f", moneyLeft);
            System.out.println(" leva left.");
        }
    }
}
