package ExamPreparation;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalPrices = 0;
        double totalTaxes = 0;

        while (!input.equals("special") && !input.equals("regular")){
            double price = Double.parseDouble(input);
            if (price < 0){
                System.out.println("Invalid price!");
            } else {
                totalPrices += price;
                double tax = 0.2 * price;
                totalTaxes += tax;
            }

            input = scanner.nextLine();
        }

        double totalPricesWithTaxes = totalPrices + totalTaxes;
        if(input.equals("special")){
            totalPricesWithTaxes = 0.9 * totalPricesWithTaxes;
        }

        if(totalPricesWithTaxes == 0){
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalPrices);
            System.out.printf("Taxes: %.2f$%n", totalTaxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$%n", totalPricesWithTaxes);
        }
    }
}
