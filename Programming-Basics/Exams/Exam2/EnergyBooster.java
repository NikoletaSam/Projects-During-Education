package Exams.Exam2;
import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int numSets = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (fruit){
            case "Watermelon":
                if (size.equals("small")){
                    price = 2 * 56;
                } else if (size.equals("big")){
                    price = 5 * 28.70;
                }
                break;
            case "Mango":
                if (size.equals("small")){
                    price = 2 * 36.66;
                } else if (size.equals("big")){
                    price = 5 * 19.60;
                }
                break;
            case "Pineapple":
                if (size.equals("small")){
                    price = 2 * 42.10;
                } else if (size.equals("big")){
                    price = 5 * 24.80;
                }
                break;
            case "Raspberry":
                if (size.equals("small")){
                    price = 2 * 20;
                } else if (size.equals("big")){
                    price = 5 * 15.20;
                }
                break;
        }

        double totalPrice = 0.0;
        double priceWithoutSale = price * numSets;
        if (priceWithoutSale >= 400 && priceWithoutSale <= 1000){
            totalPrice = priceWithoutSale - priceWithoutSale * 0.15;
        } else if (priceWithoutSale > 1000){
            totalPrice = priceWithoutSale - priceWithoutSale * 0.50;
        } else {
            totalPrice = priceWithoutSale;
        }

        System.out.printf("%.2f lv.", totalPrice);
    }
}
