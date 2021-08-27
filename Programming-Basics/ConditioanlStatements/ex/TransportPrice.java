package ConditioanlStatements.ex;
import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometres = Integer.parseInt(scanner.nextLine());
        String partOfTheDay = scanner.nextLine();
        double totalPrice = 0.0;

        if (kilometres < 20){
            if (partOfTheDay.equals("day")){
                totalPrice = kilometres * 0.79 + 0.70;
            }else {
                totalPrice = kilometres * 0.90 + 0.70;
            }
        } else if(kilometres > 100){
            totalPrice = kilometres * 0.06;
        } else {
            totalPrice = kilometres * 0.09;
        }

        System.out.printf("%.2f", totalPrice);
    }
}
