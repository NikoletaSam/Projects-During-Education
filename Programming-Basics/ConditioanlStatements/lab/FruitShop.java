package ConditioanlStatements.lab;
import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double kg = Double.parseDouble(scanner.nextLine());

        switch (fruit){
            case "banana":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                    double price = 2.50;
                    double totalPriceBanana = price * kg;
                    System.out.printf("%.2f", totalPriceBanana);
                } else if (day.equals("Saturday") || day.equals("Sunday")){
                    double price = 2.70;
                    double totalPriceBanana = price * kg;
                    System.out.printf("%.2f", totalPriceBanana);
                } else {
                    System.out.println("error");
                }
                break;
            case "apple":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                   double price = 1.20;
                    double totalPriceApple = price * kg;
                    System.out.printf("%.2f", totalPriceApple);
                } else if (day.equals("Saturday") || day.equals("Sunday")){
                   double price = 1.25;
                    double totalPriceApple = price * kg;
                    System.out.printf("%.2f", totalPriceApple);
                } else {
                    System.out.println("error");
                }
                break;
            case "orange":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                    double price = 0.85;
                    double totalPriceOrange = price * kg;
                    System.out.printf("%.2f", totalPriceOrange);
                } else if (day.equals("Saturday") || day.equals("Sunday")){
                    double price = 0.90;
                    double totalPriceOrange = price * kg;
                    System.out.printf("%.2f", totalPriceOrange);
                } else {
                    System.out.println("error");
                }
                break;
            case "grapefruit":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                    double price = 1.45;
                    double totalPriceGrapefruit = price * kg;
                    System.out.printf("%.2f", totalPriceGrapefruit);
                } else if (day.equals("Saturday") || day.equals("Sunday")){
                    double price = 1.60;
                    double totalPriceGrapefruit = price * kg;
                    System.out.printf("%.2f", totalPriceGrapefruit);
                } else {
                    System.out.println("error");
                }
                break;
            case "kiwi":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                    double price = 2.70;
                    double totalPriceKiwi = price * kg;
                    System.out.printf("%.2f", totalPriceKiwi);
                } else if (day.equals("Saturday") || day.equals("Sunday")){
                    double price = 3.00;
                    double totalPriceKiwi = price * kg;
                    System.out.printf("%.2f", totalPriceKiwi);
                } else {
                    System.out.println("error");
                }
                break;
            case "pineapple":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                    double price = 5.50;
                    double totalPricePineapple = price * kg;
                    System.out.printf("%.2f", totalPricePineapple);
                } else if (day.equals("Saturday") || day.equals("Sunday")){
                    double price = 5.60;
                    double totalPricePineapple = price * kg;
                    System.out.printf("%.2f", totalPricePineapple);
                } else {
                    System.out.println("error");
                }
                break;
            case "grapes":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                    double price = 3.85;
                    double totalPriceGrapes = kg * price;
                    System.out.printf("%.2f", totalPriceGrapes);
                } else if (day.equals("Saturday") || day.equals("Sunday")){
                    double price = 4.20;
                    double totalPriceGrapes = kg * price;
                    System.out.printf("%.2f", totalPriceGrapes);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
