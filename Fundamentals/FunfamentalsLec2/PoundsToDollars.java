package FunfamentalsLec2;
import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pounds = Integer.parseInt(scanner.nextLine());
        double dollars = (pounds * 1.0) * 1.31;

        System.out.printf("%.3f", dollars);
    }
}
