package Exams;
import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceLuggageOver20Kg = Double.parseDouble(scanner.nextLine());
        double kgLuggage = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int numLuggage = Integer.parseInt(scanner.nextLine());
        double priceLuggage = 0.0;

        if (kgLuggage < 10){
            priceLuggage = 0.20 * priceLuggageOver20Kg;
        } else if (kgLuggage <= 20){
            priceLuggage = 0.50 * priceLuggageOver20Kg;
        } else {
            priceLuggage = priceLuggageOver20Kg;
        }

        if (days > 30){
            priceLuggage = priceLuggage + 0.10 * priceLuggage;
        } else if (days >= 7){
            priceLuggage = priceLuggage + 0.15 * priceLuggage;
        } else {
            priceLuggage = priceLuggage + 0.40 * priceLuggage;
        }

        double totalPrice = numLuggage * priceLuggage;
        System.out.printf("The total price of bags is: %.2f lv.", totalPrice);
    }
}
