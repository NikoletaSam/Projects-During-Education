package ConditioanlStatements.ex;
import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int kgFood = Integer.parseInt(scanner.nextLine());
        double kgDogFoodPerDay = Double.parseDouble(scanner.nextLine());
        double kgCatFoodPerDay = Double.parseDouble(scanner.nextLine());
        double kgTurtleFoodPerDay = Double.parseDouble(scanner.nextLine());

        double totalKgFoodNeeded = days * kgCatFoodPerDay + days * kgDogFoodPerDay + days * (kgTurtleFoodPerDay / 1000);
        if(totalKgFoodNeeded < kgFood){
            double kgLeft = Math.floor(kgFood - totalKgFoodNeeded);
            System.out.printf("%.0f", kgLeft);
            System.out.println(" kilos of food left.");
        } else {
            double kgMore = Math.ceil(totalKgFoodNeeded - kgFood);
            System.out.printf("%.0f", kgMore);
            System.out.println(" more kilos of food are needed.");
        }
    }
}
