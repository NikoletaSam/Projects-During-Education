package Exams;
import java.util.Scanner;

public class AluminiumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numJoinery = Integer.parseInt(scanner.nextLine());
        String typeOfJoinery = scanner.nextLine();
        String typeOfReceiving = scanner.nextLine();
        double price = 0.0;

        switch (typeOfJoinery){
            case "90X130":
                price = 110 * numJoinery;
                if (numJoinery > 30 && numJoinery <= 60){
                    price = price - 0.05 * price;
                } else if (numJoinery > 60){
                    price = price - 0.08 * price;
                }
                break;
            case "100X150":
                price = 140 * numJoinery;
                if (numJoinery > 40 && numJoinery <= 80){
                    price = price - 0.06 * price;
                } else if (numJoinery > 80){
                    price = price - 0.10 * price;
                }
                break;
            case "130X180":
                price = 190 * numJoinery;
                if (numJoinery > 20 && numJoinery <= 50){
                    price = price - 0.07 * price;
                } else if (numJoinery > 50){
                    price = price - 0.12 * price;
                }
                break;
            case "200X300":
                price = 250 * numJoinery;
                if (numJoinery > 25 && numJoinery <= 50){
                    price = price - 0.09 * price;
                } else if (numJoinery > 50){
                    price = price - 0.14 * price;
                }
                break;
        }

        if (typeOfReceiving.equals("With delivery")){
            price = price + 60;
        }

        if (numJoinery < 10){
            System.out.println("Invalid order");
        } else if (numJoinery > 99){
            price = price - 0.04 * price;
            System.out.printf("%.2f BGN", price);
        } else {
            System.out.printf("%.2f BGN", price);
        }

    }
}
