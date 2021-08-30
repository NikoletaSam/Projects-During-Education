package ConditionalStatementsAdvanced.lab;
import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String score = scanner.nextLine();
        double price = 0.0;

        int nights = days - 1;
        switch (roomType){
            case "room for one person":
                price = nights * 18.0;
                if ( score.equals("positive")){
                    price = nights * 18.0 + 0.25 * (nights * 18.0);
                } else if (score.equals("negative")){
                    price = nights * 18.0 - 0.10 * (nights * 18.0);
                }
                System.out.printf("%.2f", price);
                break;
            case "apartment":
                price = nights * 25.0;
                if (nights < 10){
                    price = price - price * 0.30;
                } else if (nights <= 15){
                    price = price - price * 0.35;
                } else {
                    price = price - price * 0.50;
                }
                if (score.equals("positive")){
                    price = price + price * 0.25;
                } else if (score.equals("negative")){
                    price = price - price * 0.10;
                }
                System.out.printf("%.2f", price);
                break;
            case "president apartment":
                price = nights * 35.0;
                if (nights < 10){
                    price = price - price * 0.10;
                } else if (nights <= 15){
                    price = price - price * 0.15;
                } else {
                    price = price - price * 0.20;
                }
                if (score.equals("positive")){
                    price = price + price * 0.25;
                } else if (score.equals("negative")){
                    price = price - price * 0.10;
                }
                System.out.printf("%.2f", price);
                break;
        }
    }
}
