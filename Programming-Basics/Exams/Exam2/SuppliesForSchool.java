package Exams.Exam2;
import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        double litresCleanser = Double.parseDouble(scanner.nextLine());
        double sale = Double.parseDouble(scanner.nextLine());

        double pricePens = pens * 5.80;
        double priceMarkers = markers * 7.20;
        double priceCleanser = litresCleanser * 1.20;
        double totalPrice = (priceCleanser + priceMarkers + pricePens) - (priceCleanser + priceMarkers + pricePens) * (sale / 100);

        System.out.printf("%.3f", totalPrice);
    }
}
