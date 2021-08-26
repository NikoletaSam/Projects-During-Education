package FirstStepsInCoding.lab;
import java.util.Scanner;

public class GreeningYards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double area = Double.parseDouble(scan.nextLine());
        double pricePerSquareMeter = 7.61;
        double price = area*pricePerSquareMeter;
        double discount = price * 0.18;
        double totalPrice = price - discount;

        System.out.printf("The final price is: %f lv.", totalPrice);
        System.out.printf("The discount in: %f lv.", discount);
    }
}
