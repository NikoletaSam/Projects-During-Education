package Exams.Preparation;
import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wantedIncome = Double.parseDouble(scanner.nextLine());
        double totalMoney = 0;

        String cocktail = scanner.nextLine();
        while (!cocktail.equals("Party!")){
            int numCocktails = Integer.parseInt(scanner.nextLine());

            int cocktailLength = cocktail.length();
            double pricePerOrder = cocktailLength * numCocktails;
            if (pricePerOrder % 2 == 0){
                totalMoney += pricePerOrder;
            } else {
                pricePerOrder = (cocktailLength * numCocktails) - 0.25 * (cocktailLength * numCocktails);
                totalMoney += pricePerOrder;
            }

            if (totalMoney >= wantedIncome){
                System.out.println("Target acquired.");
                break;
            }
            cocktail = scanner.nextLine();
        }
        if (totalMoney < wantedIncome){
            double moneyNeeded = wantedIncome - totalMoney;
            System.out.printf("We need %.2f leva more.%n", moneyNeeded);
        }
        System.out.printf("Club income - %.2f leva.", totalMoney);
    }
}
