package ConditionalStatementsAdvanced.more;
import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        char optionHoliday = scanner.nextLine().charAt(0);
        double sum = 0.0;
        int flowers = chrysanthemums + roses + tulips;
        double totalSum = 0.0;

        switch (season){
            case "Spring":
            case "Summer":
                sum = chrysanthemums * 2.0 + roses * 4.10 + tulips * 2.50;
                if (optionHoliday == 'Y'){
                    sum = sum + 0.15 * sum;
                } else {
                    sum = sum;
                }
                if (tulips > 7){
                    sum = sum - sum * 0.05;
                }
                if (flowers > 20){
                    sum = sum - 0.20 * sum;
                }
                totalSum = sum + 2;
                System.out.printf("%.2f", totalSum);
                break;
            case "Autumn":
                sum = chrysanthemums * 3.75 + roses * 4.50 + tulips * 4.15;
                if (optionHoliday == 'Y'){
                    sum = sum + 0.15 * sum;
                } else {
                    sum = sum;
                }
                if (flowers > 20){
                    sum = sum - 0.20 * sum;
                }
                totalSum = sum + 2;
                System.out.printf("%.2f", totalSum);
                break;
            case "Winter":
                sum = chrysanthemums * 3.75 + roses * 4.50 + tulips * 4.15;
                if (optionHoliday == 'Y'){
                    sum = sum + 0.15 * sum;
                } else {
                    sum = sum;
                }
                if (roses >= 10){
                    sum = sum - sum * 0.10;
                }
                if (flowers > 20){
                    sum = sum - 0.20 * sum;
                }
                totalSum = sum + 2;
                System.out.printf("%.2f", totalSum);
                break;
        }
    }
}
