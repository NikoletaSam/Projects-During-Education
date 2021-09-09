package FundamentalsEx1;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double coin = Double.parseDouble(scanner.nextLine());
        double sum = 0;
        if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin ==2){
            sum = coin;
        } else {
            System.out.printf("Cannot accept %.2f%n", coin);
        }

        while (coin != 0){
            String beginning = scanner.nextLine();
            if (beginning.equals("Start")){
                break;
            } else {
                coin = Double.parseDouble(beginning);
                if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin ==2){
                    sum += coin;
                } else {
                    System.out.printf("Cannot accept %.2f%n", coin);
                }
            }
        }

        String product = scanner.nextLine();
        double price = 0.0;
        while (!product.equals("End")){
            switch (product){
                case "Nuts":
                    price = 2;
                    sum -= price;
                    if (sum < 0){
                        System.out.println("Sorry, not enough money");
                        sum += price;
                    } else {
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;
                case "Water":
                    price = 0.7;
                    sum -= price;
                    if (sum < 0){
                        System.out.println("Sorry, not enough money");
                        sum += price;
                    } else {
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;
                case "Crisps":
                    price = 1.5;
                    sum -= price;
                    if (sum < 0){
                        System.out.println("Sorry, not enough money");
                        sum += price;
                    } else {
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;
                case "Soda":
                    price = 0.8;
                    sum -= price;
                    if (sum < 0){
                        System.out.println("Sorry, not enough money");
                        sum += price;
                    } else {
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;
                case "Coke":
                    price = 1.0;
                    sum -= price;
                    if (sum < 0){
                        System.out.println("Sorry, not enough money");
                        sum += price;
                    } else {
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", sum);
    }
}
