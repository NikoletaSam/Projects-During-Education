package WorkingWithAbstraction.Lab.HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(input[0]);
        int numOfDays = Integer.parseInt(input[1]);
        Season currentSeason = Season.valueOf(input[2]);
        Discount currentDiscountType = Discount.valueOf(input[3]);

        PriceCalculator priceCalculator = new PriceCalculator(pricePerDay, numOfDays, currentSeason, currentDiscountType);
        System.out.printf("%.2f%n", priceCalculator.getTotalPrice());
    }
}
