package ConditionalStatementsAdvanced.ex;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int lines = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        int seats = lines * columns;
        double totalIncome = 0.0;

        switch (projection){
            case "Premiere":
                totalIncome = seats * 12.00;
                System.out.printf("%.2f leva", totalIncome);
                break;
            case "Normal":
                totalIncome = seats * 7.50;
                System.out.printf("%.2f leva", totalIncome);
                break;
            case "Discount":
                totalIncome = seats * 5.00;
                System.out.printf("%.2f leva", totalIncome);
                break;
        }
    }
}
