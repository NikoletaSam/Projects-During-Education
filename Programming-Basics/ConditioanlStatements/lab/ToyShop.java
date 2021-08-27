package ConditioanlStatements.lab;
import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceHoliday = Double.parseDouble(scanner.nextLine());
        int numPuzzles = Integer.parseInt(scanner.nextLine());
        int numDolls = Integer.parseInt(scanner.nextLine());
        int numBears = Integer.parseInt(scanner.nextLine());
        int numMinions = Integer.parseInt(scanner.nextLine());
        int numTrucks = Integer.parseInt(scanner.nextLine());
        double rent = 0;
        double priceWithoutExpenses = 0;
        int totalNumToys = numBears + numMinions + numTrucks + numDolls + numPuzzles;

        double pricePuzzles = numPuzzles * 2.60;
        double priceDolls = numDolls * 3.00;
        double priceBears = numBears * 4.10;
        double priceMinions = numMinions * 8.20;
        double priceTrucks = numTrucks * 2.00;
        double totalPrice = priceBears + priceDolls + priceTrucks + priceMinions + pricePuzzles;
        rent = totalPrice * 0.10;
        priceWithoutExpenses = totalPrice - rent;

        if(totalNumToys >= 50){
            double priceWithoutDiscount = totalPrice - totalPrice * 0.25;
            rent = priceWithoutDiscount * 0.10;
            priceWithoutExpenses = priceWithoutDiscount - rent;
        }
        if (priceWithoutExpenses >= priceHoliday){
            double moneyLeft = priceWithoutExpenses - priceHoliday;
            System.out.print("Yes! ");
            System.out.printf("%.2f", moneyLeft);
            System.out.println(" lv left.");
        }else{
            double moneyNeeded = priceHoliday - priceWithoutExpenses;
            System.out.print("Not enough money! ");
            System.out.printf("%.2f", moneyNeeded);
            System.out.println(" lv needed.");
        }

    }
}
