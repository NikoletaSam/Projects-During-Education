package ConditionalStatementsAdvanced.lab;
import java.util.Scanner;

public class Fuel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double litres = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();
        double price = 0.0;

        switch (fuelType){
            case "Gasoline":
                price = litres * 2.22;
                if (card.equals("Yes")){
                    price = price - litres * 0.18;
                } else if (card.equals("No")){
                    price = price;
                }
                if (litres >= 20 && litres <= 25){
                    price = price - 0.08 * price;
                } else if (litres > 25){
                    price = price - 0.10 * price;
                }
                System.out.printf("%.2f lv.", price);
                break;
            case "Diesel":
                price = litres * 2.33;
                if (card.equals("Yes")){
                    price = price - litres * 0.12;
                } else if (card.equals("No")){
                    price = price;
                }
                if (litres >= 20 && litres <= 25){
                    price = price - 0.08 * price;
                } else if (litres > 25){
                    price = price - 0.10 * price;
                }
                System.out.printf("%.2f lv.", price);
                break;
            case "Gas":
                price = litres * 0.93;
                if (card.equals("Yes")){
                    price = price - litres * 0.08;
                } else if (card.equals("No")){
                    price = price;
                }
                if (litres >= 20 && litres <= 25){
                    price = price - 0.08 * price;
                } else if (litres > 25){
                    price = price - 0.10 * price;
                }
                System.out.printf("%.2f lv.", price);
                break;
        }

    }
}
